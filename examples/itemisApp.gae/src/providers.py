
from lib.simplexml import parse
from urllib import urlopen, quote

def plainxml(url):
    return parse( urlopen(url) )


def CurrentTimeline():
    url = '%s%s' % ('http://heikobehrens.net/misc/jazoon11/sanitize.php?url=', 'https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/1/public/values') #foo
    xml = plainxml(url)
    return xml.entry


def Blogposts():
    url = '%s%s' % ('http://feedsanitizer.appspot.com', '/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss') #foo
    xml = plainxml(url)
    return xml.channel.item


def AllOffices():
    url = '%s%s' % ('http://heikobehrens.net/misc/jazoon11/sanitize.php?url=', 'https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/3/public/values') #foo
    xml = plainxml(url)
    return xml.entry


def EventById(id):
    url = '%s%s' % ('http://heikobehrens.net/misc/jazoon11/sanitize.php?url=', quote(('%s%s' % ('https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/1/public/values?sq=id==', id)).encode("utf8"))) #foo
    xml = plainxml(url)
    return xml.entry


def PersonByName(name):
    url = '%s%s' % ('http://heikobehrens.net/misc/jazoon11/sanitize.php?url=', quote(('%s%s' % ('https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/2/public/values?sq=id%3D', quote((name.replace(' ', '')).encode("utf8")))).encode("utf8"))) #foo
    xml = plainxml(url)
    return xml.entry


def OfficeResolver(location):
    url = '%s%s' % ('https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/3/public/values?sq=location%3D', quote((location).encode("utf8"))) #foo
    xml = plainxml(url)
    return xml.entry


def BlogItemById(guid):
    url = '%s%s%s' % ('http://feedsanitizer.appspot.com', '/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss&id=', quote((guid).encode("utf8"))) #foo
    xml = plainxml(url)
    return xml.channel.item


