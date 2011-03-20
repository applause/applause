
from lib.simplexml import parse
from urllib import urlopen, quote

def plainxml(url):
    return parse( urlopen(url) )


def SessionsByDay(day):
    url = '%s%s%s%s' % ('http://localhost:3000', '/sessions/day/', day, '.xml')
    xml = plainxml(url)
    return xml.session


def AllSpeakers():
    url = '%s%s' % ('http://localhost:3000', '/speakers.xml')
    xml = plainxml(url)
    return xml.speaker


def BlogItemById(b):
    url = '%s%s' % ('dfsdfsdfsdfs', b.link)
    xml = plainxml(url)
    return xml.session


def SpeakerByName(name):
    url = '%s%s%s%s' % ('http://localhost:3000', '/speakers/name/', quote(name), '.xml')
    xml = plainxml(url)
    return xml.speaker


def SessionById(s):
    url = '%s%s%s%s' % ('http://localhost:3000', '/sessions/id/', s.id, '.xml')
    xml = plainxml(url)
    return xml.session


