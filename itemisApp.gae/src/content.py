from simplexml import parse
from urllib import urlopen, quote

#BASE_NODE_URL = 'http://eclipsecon2011.appspot.com'
BASE_NODE_URL = 'http://localhost:3000'

BASE_SANITIZER_URL = "http://localhost:8000/sanitize?url=http%3A%2F%2Flocalhost%3A3000%2Fitemisblog.xml&format=rss"

def plainxml(url):
    return parse( urlopen(url) )

def sessionsByDay(day):
    url = '%s%s%s%s' % (BASE_NODE_URL, '/sessions/day/', day, '.xml')
    xml = plainxml(url)
    return xml.session
    
def allSpeakers():
    url = '%s%s' % (BASE_NODE_URL,  '/speakers.xml')
    xml = plainxml(url)
    return xml.speaker
        
        
def speakerByName(name):
    url = '%s%s%s%s' % (BASE_NODE_URL, '/speakers/name/', quote(name), '.xml')
    xml = plainxml(url)
    return xml.speaker

def speakerById(id):
    url = '%s%s%s%s' % (BASE_NODE_URL, '/speakers/id/', quote(id), '.xml')
    xml = plainxml(url)
    return xml.speaker

def sessionById(id):
    url = '%s%s%s%s' % (BASE_NODE_URL, '/sessions/id/', quote(id), '.xml')
    xml = plainxml(url)
    return xml.session

def allBlogItems():
    url = BASE_SANITIZER_URL;
    xml = plainxml(url)
    return xml.channel.item
    
def blogItemById(id):
    url = "%s&id=%s" % (BASE_SANITIZER_URL, quote(id))
    xml = plainxml(url)
    return xml.channel.item    