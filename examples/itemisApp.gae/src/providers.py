
from lib.simplexml import parse
from urllib import urlopen, quote

def plainxml(url):
    return parse( urlopen(url) )


def CurrentTimeline():
    url = 'http://www.itemis.de/language=de/~xml.timeline/37606' #foo
    xml = plainxml(url)
    return xml.events


def Blogposts():
    url = '%s%s' % ('http://feedsanitizer.appspot.com', '/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss') #foo
    xml = plainxml(url)
    return xml.channel.item


def CompanyDescription():
    url = 'http://www.itemis.de/language=de/~xml.company/37606' #foo
    xml = plainxml(url)
    return xml.company


def CareerData():
    url = 'http://www.itemis.de/language=de/~xml.carreer/37606' #foo
    xml = plainxml(url)
    return xml.carreer


def EventById(id):
    url = '%s%s' % ('http://www.itemis.de/language=de/~xml.applause/', id) #foo
    xml = plainxml(url)
    return xml.event


def PersonByName(name):
    url = '%s%s%s' % ('http://www.itemis.de/applause/people/de/', quote((name).encode("utf8")), '.xml') #foo
    xml = plainxml(url)
    return xml.contact


def OfficeById(id):
    url = '%s%s' % ('http://www.itemis.de/language=de/~xml.applause/', id) #foo
    xml = plainxml(url)
    return xml.office


def BlogItemById(guid):
    url = '%s%s%s' % ('http://feedsanitizer.appspot.com', '/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss&id=', quote((guid).encode("utf8"))) #foo
    xml = plainxml(url)
    return xml.channel.item


def JobById(id):
    url = '%s%s' % ('http://www.itemis.de/language=de/~xml.applause/', id) #foo
    xml = plainxml(url)
    return xml.job


