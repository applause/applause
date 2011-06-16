from django.db import models
from djangotoolbox.fields import ListField
from copy import deepcopy

import re
regex = type(re.compile(''))

FIELD_INDEXES = {}
COLUMN_TO_NAME = {}

def get_index_name(field_name, lookup_type):
    if lookup_type in ('iexact', 'istartswith'):
        index_name = 'idxf_%s_l_icase' % (field_name)
    elif isinstance(lookup_type, regex) or lookup_type in ('regex', 'iregex'):
        index_name = 'idxf_%s_l_%s' % (field_name, 'regex')
    else:
        index_name = 'idxf_%s_l_%s' % (field_name, lookup_type)

    return index_name

def get_denormalization_info(start_model, name):
    denormalized_model = start_model
    for value in name.split('__')[:-1]:
        denormalized_model = denormalized_model._meta.get_field(value).rel.to

    return denormalized_model, denormalized_model._meta.get_field(name.split('__')[-1])

def get_column_name(start_model, name):
    # returns the column name for name or a chain of column names if name contains
    # '__' in the case of JOINs
    denormalized_model = start_model
    column_name = ''
    for value in name.split('__')[:-1]:
        column_name += denormalized_model._meta.get_field(value).column + '__'
        denormalized_model = denormalized_model._meta.get_field(value).rel.to

    return column_name + denormalized_model._meta.get_field(name.split('__')[-1]).column

def register_index(model, mapping):
    for name, lookup_types in mapping.items():
        regex_index = False
        if isinstance(lookup_types, basestring):
            lookup_types = (lookup_types,)

        denormalized_model = None
        if len(name.split('__', 1)) > 1:
            # foreign key case
            denormalized_model, field = get_denormalization_info(model, name)
        else:
            field = model._meta.get_field(name)

        column_name = get_column_name(model, name)
        COLUMN_TO_NAME[column_name] = name
        name = column_name
        new_lookup_types = list(lookup_types)
        for lookup_type in lookup_types:
            # TODO: for denormalization the index_name should not contain '__'
            index_name = get_index_name(name, lookup_type)
            if lookup_type in ('month', 'day', 'year', 'week_day'):
                index_field = models.IntegerField(editable=False, null=True)
            elif isinstance(lookup_type, regex):
                lookup_type = re.compile(lookup_type.pattern, re.S | re.U |
                    (lookup_type.flags & re.I))
                # add (i)regex lookup type to map for later conversations
                if not lookup_type.flags & re.I and 'regex' not in new_lookup_types:
                    new_lookup_types.append('regex')
                elif lookup_type.flags & re.I and 'iregex' not in new_lookup_types:
                    new_lookup_types.append('iregex')
                # for each indexed field only add one list field shared by all
                # regexes
                if regex_index:
                    continue
                index_field = ListField(models.CharField(
                    max_length=256), editable=False, null=True)
                regex_index = True
            elif lookup_type == 'contains':
                # in the case of foreignkey we do not know which max_length to use
                # so use 500
                index_field = ListField(models.CharField(
                    max_length=field.max_length or 500), editable=False, null=True)
            elif lookup_type == '$default':
                # TODO: rename $default because it will be used for the field name
                # and not every database allows to use the sign $
                index_field = deepcopy(field)
                if isinstance(index_field, (models.DateTimeField,
                        models.DateField, models.TimeField)):
                    index_field.auto_now_add = index_field.auto_now = False
            else:
                # in the case of foreignkey we do not know which max_length to use
                # so use 500
                index_field = models.CharField(max_length=field.max_length or 500,
                    editable=False, null=True)
            model.add_to_class(index_name, index_field)

        if denormalized_model:
            # denormalization case, for denormalized fields we append
            # 'denormalized__' to the lookup_type so dbindexer knows that it
            # should denormalize when saving an entity of the denormalized model
            denormalization_lookup_types = []
            for lookup_type in new_lookup_types:
                denormalization_lookup_types.append('denormalized__%s' % lookup_type)
            FIELD_INDEXES.setdefault(denormalized_model, {})
            if field.column not in FIELD_INDEXES[denormalized_model]:
                FIELD_INDEXES[denormalized_model][field.column] = denormalization_lookup_types
            else:
                FIELD_INDEXES[denormalized_model][field.column].extend(denormalization_lookup_types)

        # set new lookup_types (can be different because of regex lookups)
        FIELD_INDEXES.setdefault(model, {})[name] = new_lookup_types

    # debug info
#    print COLUMN_TO_NAME
#    print FIELD_INDEXES
#    print [(field.name, field.__class__.__name__) for field in model._meta.fields]
