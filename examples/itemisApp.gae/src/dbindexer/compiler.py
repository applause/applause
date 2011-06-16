from .api import FIELD_INDEXES, COLUMN_TO_NAME, get_index_name, get_column_name, regex
from django.db import models
from django.db.models.sql import aggregates as sqlaggregates
from django.db.models.sql.constants import LOOKUP_SEP, MULTI, SINGLE, LHS_ALIAS,\
    JOIN_TYPE, LHS_JOIN_COL, TABLE_NAME, RHS_JOIN_COL
from django.db.models.sql.where import AND, OR
from django.db.utils import DatabaseError, IntegrityError
from django.utils.tree import Node
import re

def contains_indexer(value):
    # In indexing mode we add all postfixes ('o', 'lo', ..., 'hello')
    result = []
    result.extend([value[count:] for count in range(len(value))])
    return result

LOOKUP_TYPE_CONVERSION = {
    'iexact': lambda value, _: ('exact', value.lower()),
    'istartswith': lambda value, _: ('startswith', value.lower()),
    'iendswith': lambda value, _: ('startswith', value[::-1].lower()),
    'endswith': lambda value, _: ('startswith', value[::-1]),
    'year': lambda value, _: ('exact', value),
    'month': lambda value, _: ('exact', value),
    'day': lambda value, _: ('exact', value),
    'week_day': lambda value, _: ('exact', value),
    'contains': lambda value, _: ('startswith', value),
    'icontains': lambda value, _: ('startswith', value.lower()),
    'regex': lambda value, _: ('exact', ':' + value),
    'iregex': lambda value, _: ('exact', 'i:' + value),
}

# value conversion for (i)regex works via special code
VALUE_CONVERSION = {
    'iexact': lambda value: value.lower(),
    'istartswith': lambda value: value.lower(),
    'endswith': lambda value: value[::-1],
    'iendswith': lambda value: value[::-1].lower(),
    'year': lambda value: value.year,
    'month': lambda value: value.month,
    'day': lambda value: value.day,
    'week_day': lambda value: value.isoweekday(),
    'contains': lambda value: contains_indexer(value),
    'icontains': lambda value: [val.lower() for val in contains_indexer(value)],
    # TODO: clean $default case
    '$default': lambda value: value,
}

def get_denormalization_value(start_model, index_key, foreignkey_pk):
    denormalized_model = start_model._meta.get_field(index_key.split('__')[0]).rel.to
    foreignkey = denormalized_model.objects.all().get(pk=foreignkey_pk)
    for value in index_key.split('__')[1:-1]:
        foreignkey = getattr(foreignkey, value)
    return getattr(foreignkey, index_key.split('__')[-1])


def __repr__(self):
    return '<%s, %s, %s, %s>' % (self.alias, self.col, self.field.name,
        self.field.model.__name__)

from django.db.models.sql.where import Constraint
Constraint.__repr__ = __repr__

# TODO: manipulate a copy of the query instead of the query itself. This has to
# be done because the query can be reused afterwoods by the user so that a
# manipulated query can result in strange behavior for these cases!

class BaseCompiler(object):
    def get_column_index(self, constraint):
        if constraint.field:
            column_chain = constraint.field.column
            alias = constraint.alias
            while alias:
                join = self.query.alias_map[alias]
                if join[JOIN_TYPE] == 'INNER JOIN':
                    column_chain += '__' + join[LHS_JOIN_COL]
                    alias = self.query.alias_map[alias][LHS_ALIAS]
                else:
                    alias = None
        return '__'.join(reversed(column_chain.split('__')))

    def resolve_join(self, constraint, lookup_type, annotation, value, filters,
            index, column_index):
        if not constraint.field:
            return

        alias = constraint.alias
        while True:
            next_alias = self.query.alias_map[alias][LHS_ALIAS]
            if not next_alias:
                break
            self.unref_alias(alias)
            alias = next_alias

        index_name = get_index_name(column_index, lookup_type)
        lookup_type, value = LOOKUP_TYPE_CONVERSION[lookup_type](value,
            annotation)
        constraint.alias = alias
        constraint.field = self.query.get_meta().get_field(index_name)
        constraint.col = constraint.field.column
        child = (constraint, lookup_type, annotation, value)
        filters.children[index] = child

    def unref_alias(self, alias):
        table_name = self.query.alias_map[alias][TABLE_NAME]
        self.query.alias_refcount[alias] -= 1
        if self.query.alias_refcount[alias] < 1:
            # Remove all information about the join
            del self.query.alias_refcount[alias]
            del self.query.join_map[self.query.rev_join_map[alias]]
            del self.query.rev_join_map[alias]
            del self.query.alias_map[alias]
            self.query.table_map[table_name].remove(alias)
            if len(self.query.table_map[table_name]) == 0:
                del self.query.table_map[table_name]
            self.query.used_aliases.discard(alias)

    def convert_filters(self, filters):
        model = self.query.model
        for index, child in enumerate(filters.children[:]):
            if isinstance(child, Node):
                self.convert_filters(child)
                continue

            constraint, lookup_type, annotation, value = child
            if model in FIELD_INDEXES and constraint.field is not None:
                if lookup_type == 'isnull' and \
                        isinstance(constraint.field, models.ForeignKey):
                    self.fix_fk_null_filter(constraint)
                if constraint.alias == self.query.table_map[model._meta.db_table][0]:
                    if lookup_type not in FIELD_INDEXES[model].get(constraint.field.column, ()):
                        continue
                    index_name = get_index_name(constraint.field.column, lookup_type)
                    lookup_type, value = LOOKUP_TYPE_CONVERSION[lookup_type](value,
                        annotation)
                    constraint.field = self.query.get_meta().get_field(index_name)
                    constraint.col = constraint.field.column
                    child = (constraint, lookup_type, annotation, value)
                    filters.children[index] = child
                else:
                    # check for joins
                    column_index = self.get_column_index(constraint)
                    if lookup_type in FIELD_INDEXES[model].get(column_index, ()):
                        self.resolve_join(constraint, lookup_type, annotation,
                            value, filters, index, column_index)

    def fix_fk_null_filter(self, constraint):
        # Django doesn't generate correct code for ForeignKey__isnull.
        # It becomes a JOIN with pk__isnull which won't work on nonrel DBs,
        # so we rewrite the JOIN here.
        alias = constraint.alias
        table_name = self.query.alias_map[alias][TABLE_NAME]
        lhs_join_col = self.query.alias_map[alias][LHS_JOIN_COL]
        rhs_join_col = self.query.alias_map[alias][RHS_JOIN_COL]
        if table_name != constraint.field.rel.to._meta.db_table or \
                rhs_join_col != constraint.field.rel.to._meta.pk.column or \
                lhs_join_col != constraint.field.column:
            return
        next_alias = self.query.alias_map[alias][LHS_ALIAS]
        if not next_alias:
            return
        self.unref_alias(alias)
        alias = next_alias
        constraint.col = constraint.field.column
        constraint.alias = alias

class SQLCompiler(BaseCompiler):
    def execute_sql(self, *args, **kwargs):
        self.convert_filters(self.query.where)
        return super(SQLCompiler, self).execute_sql(*args, **kwargs)

    def results_iter(self):
        self.convert_filters(self.query.where)
        return super(SQLCompiler, self).results_iter()

class SQLInsertCompiler(BaseCompiler):
    def execute_sql(self, return_id=False):
        position = {}
        for index, (field, value) in enumerate(self.query.values[:]):
            position[field.name] = index

        model = self.query.model
        # TODO: we should reverse this iteration, instead of iterating through all
        # fields and values and then looking up their index definitions we should
        # iterate through all index definitions first and getting the
        # corresponding fields and values or in general we need to refactore the
        # whole dbindexer ;)
        for field, value in self.query.values[:]:
            regex_values = []
            index_keys = []
            if field is None or model not in FIELD_INDEXES:
                continue
            if field.column not in FIELD_INDEXES[model]:
                # check for denormalization indexes, if none exist continue with
                # next field
                denormalization_indexes = [field_index.split('__', 1)[0]
                    for field_index in FIELD_INDEXES[model].keys()]
                if field.column not in denormalization_indexes:
                    continue
                else:
                    for field_index in FIELD_INDEXES[model].keys():
                        # check against field column + '__' to avoid name clashes
                        # caused by startswith i.e. field.column = foreignkey
                        # and field2.column = foreignkey2
                        if field_index.startswith(field.column + '__'):
                            index_keys.append(field_index)
            else:
                start_background_tasks = [lookup_type.startswith('denormalized__')
                    for lookup_type in FIELD_INDEXES[model][field.column]
                    if not isinstance(lookup_type, regex)]
                if True in start_background_tasks:
                    # TODO: we should push background tasks here, background tasks
                    # have to use model.update to ensure transactional behavior
                    continue
                index_keys.append(field.column)
                # check for denormalization indexes here too
                for field_index in FIELD_INDEXES[model].keys():
                    # check against field name + '__' to avoid name clashes
                    # i.e. field.name = foreignkey and field2.name = foreignkey2
                    if field_index.startswith(field.column + '__'):
                        index_keys.append(field_index)

            foreign_key_pk = value
            for index_key in index_keys:
                for lookup_type in FIELD_INDEXES[model][index_key]:
                    if len(index_key.split('__', 1)) > 1:
                        # TODO: this has to be done in background too so that it's
                        # possible to use transactions, background tasks
                        # have to use model.update to ensure transactional behavior
                        # denormalization case
                        value = get_denormalization_value(model,
                            COLUMN_TO_NAME[index_key], foreign_key_pk)
                    if lookup_type in ['regex', 'iregex']:
                        continue
                    index_name = get_index_name(index_key, lookup_type)
                    index_field = model._meta.get_field(index_name)
                    if isinstance(lookup_type, regex):
                        if lookup_type.match(value):
                            val = ('i:' if lookup_type.flags & re.I else ':') + \
                                lookup_type.pattern
                            regex_values.append(val)
                        self.query.values[position[index_name]] = (index_field,
                            regex_values)
                    else:
                        if isinstance(field, models.ForeignKey) and \
                                len(index_key.split('__', 1)) <= 1:
                            # case for which we try to convert the foreign key
                            # value itself
                            value = unicode(value)
                        self.query.values[position[index_name]] = (index_field,
                            VALUE_CONVERSION[lookup_type](value))
        # debug info
#        print dict((field.column, value) for field, value in self.query.values)
        return super(SQLInsertCompiler, self).execute_sql(return_id=return_id)

class SQLUpdateCompiler(BaseCompiler):
    pass

class SQLDeleteCompiler(BaseCompiler):
    pass
