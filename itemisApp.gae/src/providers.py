
from lib.simplexml import parse
from urllib import urlopen, quote

def plainxml(url):
    return parse( urlopen(url) )


def Blogposts():
    url = '%s%s' % ('http://feedsanitizer.appspot.com', '/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss') #foo
    xml = plainxml(url)
    return xml.channel.item


def SessionsByDay(day):
    url = '%s%s%s%s' % ('http://localhost:3000', '/sessions/day/', day, '.xml') #foo
    xml = plainxml(url)
    return xml.session


def AllSpeakers():
    url = '%s%s' % ('http://localhost:3000', '/speakers.xml') #foo
    xml = plainxml(url)
    return xml.speaker


def BlogItemById(guid):
    url = '%s%s%s' % ('http://feedsanitizer.appspot.com', '/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss&id=', quote(guid)) #foo
    xml = plainxml(url)
    return xml.channel.item


def SpeakerByName(name):
    url = '%s%s%s%s' % ('http://localhost:3000', '/speakers/name/', quote(name), '.xml') #foo
    xml = plainxml(url)
    return xml.speaker


def SessionById(id):
    url = '%s%s%s%s' % ('http://localhost:3000', '/sessions/id/', id, '.xml') #foo
    xml = plainxml(url)
    return xml.session


