
from lib.simplexml import parse
from urllib import urlopen, quote

def plainxml(url):
    return parse( urlopen(url) )


def allCommitsByRepository(path):
    url = '%s%s%s' % ('http://github.com/api/v2/xml/commits/list/', path, '/master') #foo
    xml = plainxml(url)
    return xml.commit


def userData(login):
    url = '%s%s' % ('http://github.com/api/v2/xml/user/search/', login) #foo
    xml = plainxml(url)
    return xml.user


def allRepositoriesByUser(login):
    url = '%s%s' % ('http://github.com/api/v2/xml/repos/show/', login) #foo
    xml = plainxml(url)
    return xml.repository


