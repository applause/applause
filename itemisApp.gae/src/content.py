from simplexml import parse
from urllib import urlopen, quote

def sessionsByDay(day):
    url = '%s%s%s' % ('http://eclipsecon2011.appspot.com/sessions/day/', day, '?format=xml')
    xml = parse( urlopen(url) )
    return xml.session
    
def allSpeakers():
    url = 'http://eclipsesummit2010.appspot.com/speakers/?format=xml'
    xml = parse( urlopen(url) )
    return xml.speakers.speaker
        
        
def speakerByName(name):
    url = '%s%s%s' % ('http://eclipsesummit2010.appspot.com/speakers/name/', quote(name), '/?format=xml')
    xml = parse( urlopen(url) )
    return xml.speaker