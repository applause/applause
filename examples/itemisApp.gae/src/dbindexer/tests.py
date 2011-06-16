from dbindexer.api import register_index
from django.db import models
from django.test import TestCase
from datetime import datetime
import re

class ForeignIndexed2(models.Model):
    name = models.CharField(max_length=500)
    
class ForeignIndexed(models.Model):
    title = models.CharField(max_length=500)
    name = models.CharField(max_length=500)
    fk = models.ForeignKey(ForeignIndexed2, null=True)

class Indexed(models.Model):
    name = models.CharField(max_length=500)
    published = models.DateTimeField(auto_now_add=True)
    foreignkey = models.ForeignKey(ForeignIndexed, null=True)
    foreignkey2 = models.ForeignKey(ForeignIndexed2, related_name='idx_set', null=True)

register_index(Indexed, {
    'name': ('iexact', 'endswith', 'istartswith', 'iendswith', 'contains',
        'icontains', re.compile('^i+', re.I), re.compile('^I+'),
        re.compile('^i\d*i$', re.I)),
    'published': ('month', 'day', 'week_day'),
    'foreignkey': 'iexact',
    'foreignkey__title': 'iexact',
    'foreignkey__fk__name': 'iexact',
    'foreignkey__name': 'iexact',
    'foreignkey2__name': '$default'
})

class TestIndexed(TestCase):
    def setUp(self):
        juubi = ForeignIndexed2(name='Juubi')
        juubi.save()
        kyuubi = ForeignIndexed(name='Kyuubi', title='Bijuu', fk=juubi)
        kyuubi.save()
        Indexed(name='ItAchi', foreignkey=kyuubi, foreignkey2=juubi).save()
        Indexed(name='YondAimE', foreignkey=kyuubi, foreignkey2=juubi).save()
        Indexed(name='I1038593i', foreignkey=kyuubi, foreignkey2=juubi).save()

    def test_joins(self):
        self.assertEqual(3, len(Indexed.objects.all().filter(
            foreignkey__fk__name__iexact='juuBi')))
        self.assertEqual(3, len(Indexed.objects.all().filter(
            foreignkey__fk__name__iexact='juuBi',
            foreignkey__title__iexact='biJuu')))
        self.assertEqual(3, len(Indexed.objects.all().filter(
            foreignkey__name__iexact='kyuuBi', foreignkey__title__iexact='biJuu')))
        self.assertEqual(3, len(Indexed.objects.all().filter(
            foreignkey__title__iexact='biJuu')))
        self.assertEqual(1, len(Indexed.objects.all().filter(
            foreignkey__title__iexact='biJuu', name__iendswith='iMe')))

    def test_fix_fk_isnull(self):
        self.assertEqual(0, len(Indexed.objects.filter(foreignkey=None)))
        self.assertEqual(3, len(Indexed.objects.exclude(foreignkey=None)))

    def test_iexact(self):
        self.assertEqual(1, len(Indexed.objects.filter(name__iexact='itaChi')))
        self.assertEqual(1, Indexed.objects.filter(name__iexact='itaChi').count())

    def test_delete(self):
        Indexed.objects.get(name__iexact='itaChi').delete()
        self.assertEqual(0, Indexed.objects.all().filter(name__iexact='itaChi').count())

    def test_delete_query(self):
        Indexed.objects.all().delete()
        self.assertEqual(0, Indexed.objects.all().filter(name__iexact='itaChi').count())

    def test_istartswith(self):
        self.assertEqual(1, len(Indexed.objects.all().filter(name__istartswith='iTa')))

    def test_endswith(self):
        self.assertEqual(1, len(Indexed.objects.all().filter(name__endswith='imE')))
        self.assertEqual(1, len(Indexed.objects.all().filter(name__iendswith='iMe')))

    def test_regex(self):
        self.assertEqual(2, len(Indexed.objects.all().filter(name__iregex='^i+')))
        self.assertEqual(2, len(Indexed.objects.all().filter(name__regex='^I+')))
        self.assertEqual(0, len(Indexed.objects.all().filter(name__regex='^i+')))
        self.assertEqual(1, len(Indexed.objects.all().filter(name__iregex='^i\d*i$')))

    def test_date_filters(self):
        now = datetime.now()
        self.assertEqual(3, len(Indexed.objects.all().filter(published__month=now.month)))
        self.assertEqual(3, len(Indexed.objects.all().filter(published__day=now.day)))
        self.assertEqual(3, len(Indexed.objects.all().filter(
            published__week_day=now.isoweekday())))

#    def test_contains(self):
#        # passes on production but not on gae-sdk (development)
#        self.assertEqual(1, len(Indexed.objects.all().filter(name__contains='Aim')))
#        self.assertEqual(1, len(Indexed.objects.all().filter(name__icontains='aim')))