
from lib.simplexml import parse
from urllib import urlopen, quote

def plainxml(url):
    return parse( urlopen(url) )


def CompanyDescription():
    url = '%s%s' % ('http://dl.dropbox.com/u/232067/applause-sampledata/', 'company.xml') #foo
    xml = plainxml(url)
    return xml.company


def __EventById(id):
    url = '%s%s%s%s' % ('http://dl.dropbox.com/u/232067/applause-sampledata/', 'events/', quote((id).encode("utf8")), '.xml') #foo
    xml = plainxml(url)
    return xml.event


def CurrentTimeline():
    url = '%s%s' % ('http://dl.dropbox.com/u/232067/applause-sampledata/', 'timeline.xml') #foo
    xml = plainxml(url)
    return xml.events


def Blogposts():
    url = '%s%s' % ('http://feedsanitizer.appspot.com', '/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss') #foo
    xml = plainxml(url)
    return xml.channel.item


def CarreerData():
    url = '%s%s' % ('http://dl.dropbox.com/u/232067/applause-sampledata/', 'carreer.xml') #foo
    xml = plainxml(url)
    return xml.carreer


def EventById(id):
    url = '%s%s%s%s' % ('http://dl.dropbox.com/u/232067/applause-sampledata/', 'events/', quote((id).encode("utf8")), '.xml') #foo
    xml = plainxml(url)
    return xml.event


def PersonByName(name):
    url = '%s%s%s%s' % ('http://dl.dropbox.com/u/232067/applause-sampledata/', 'contacts/', quote((name).encode("utf8")), '.xml') #foo
    xml = plainxml(url)
    return xml.contact


def OfficeResolver(location):
    url = '%s%s%s%s' % ('http://dl.dropbox.com/u/232067/applause-sampledata/', 'offices/', quote((location).encode("utf8")), '.xml') #foo
    xml = plainxml(url)
    return xml.office


def BlogItemById(guid):
    url = '%s%s%s' % ('http://feedsanitizer.appspot.com', '/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss&id=', quote((guid).encode("utf8"))) #foo
    xml = plainxml(url)
    return xml.channel.item


def JobById(id):
    url = '%s%s%s%s' % ('http://dl.dropbox.com/u/232067/applause-sampledata/', 'jobs/', quote((id).encode("utf8")), '.xml') #foo
    xml = plainxml(url)
    return xml.job


