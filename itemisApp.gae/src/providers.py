
from lib.simplexml import parse
from urllib import urlopen, quote

def plainxml(url):
    return parse( urlopen(url) )


def SessionsByDay(day):
    url = '%s%s%s%s' % ('http://localhost:3000', '/sessions/day/', day, '.xml') #foo
    xml = plainxml(url)
    return xml.session


def AllSpeakers():
    url = '%s%s' % ('http://localhost:3000', '/speakers.xml') #foo
    xml = plainxml(url)
    return xml.speaker


def BlogItemById(link):
    url = '%s%s' % ('dfsdfsdfsdfs', link) #foo
    xml = plainxml(url)
    return xml.session


def SpeakerByName(name):
    url = '%s%s%s%s' % ('http://localhost:3000', '/speakers/name/', quote(name), '.xml') #foo
    xml = plainxml(url)
    return xml.speaker


def SessionById(id):
    url = '%s%s%s%s' % ('http://localhost:3000', '/sessions/id/', id, '.xml') #foo
    xml = plainxml(url)
    return xml.session


