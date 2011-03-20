
from lib.simplexml import parse
from urllib import urlopen, quote

def plainxml(url):
    return parse( urlopen(url) )


def SessionListBySessionsByDay(day):
    url = '%s%s%s%s' % ('http://localhost:3000', '/sessions/day/', day, '.xml')
    xml = plainxml(url)
    return xml.session


def SpeakersListByAllSpeakers():
    url = '%s%s' % ('http://localhost:3000', '/speakers.xml')
    xml = plainxml(url)
    return xml.speaker


def BlogDetailsByBlogItemById(b):
    url = '%s%s' % ('dfsdfsdfsdfs', b.link)
    xml = plainxml(url)
    return xml.session


def SpeakerDetailsBySpeakerByName(name):
    url = '%s%s%s%s' % ('http://localhost:3000', '/speakers/name/', quote(name), '.xml')
    xml = plainxml(url)
    return xml.speaker


def SessionDetailsBySessionById(s):
    url = '%s%s%s%s' % ('http://localhost:3000', '/sessions/id/', s.id, '.xml')
    xml = plainxml(url)
    return xml.session


