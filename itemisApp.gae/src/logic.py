from django.http import HttpResponse
from django.utils import simplejson
from models import Speaker, Session, Participation
import logging
#from datetime import datetime
import urllib

#===============================================================================
# def unescape(s):
#    if s == None:
#        return s
#    
#    want_unicode = False
#    if isinstance(s, unicode):
#        s = s.encode("utf-8")
#        want_unicode = True
# 
#    # the rest of this assumes that `s` is UTF-8
#    list = []
# 
#    # create and initialize a parser object
#    p = xml.parsers.expat.ParserCreate("utf-8")
#    p.buffer_text = True
#    p.returns_unicode = want_unicode
#    p.CharacterDataHandler = list.append
# 
#    # parse the data wrapped in a dummy element
#    # (needed so the "document" is well-formed)
#    p.Parse("<e>", 0)
#    p.Parse(s, 0)
#    p.Parse("</e>", 1)
# 
#    # join the extracted strings and return
#    es = ""
#    if want_unicode:
#        es = u""
#    return es.join(list)
#===============================================================================

#===============================================================================
# def unescape(text):
#    """Removes HTML or XML character references 
#        and entities from a text string.
#    @param text The HTML (or XML) source text.
#    @return The plain text, as a Unicode string, if necessary.
#    from Fredrik Lundh
#    2008-01-03: input only unicode characters string.
#    http://effbot.org/zone/re-sub.htm#unescape-html
#    """
#    def fixup(m):
#        text = m.group(0)
#        if text[:2] == "&#":
#            # character reference
#            try:
#                if text[:3] == "&#x":
#                    return unichr(int(text[3:-1], 16))
#                else:
#                    return unichr(int(text[2:-1]))
#            except ValueError:
#                print "Value Error"
#                pass
#        else:
#            # named entity
#            # reescape the reserved characters.
#            try:
#                if text[1:-1] == "amp":
#                    text = "&amp;amp;"
#                elif text[1:-1] == "gt":
#                    text = "&amp;gt;"
#                elif text[1:-1] == "lt":
#                    text = "&amp;lt;"
#                else:
#                    print text[1:-1]
#                    text = unichr(htmlentitydefs.name2codepoint[text[1:-1]])
#            except KeyError:
#                print "keyerror"
#                pass
#        return text # leave as is
#    return re.sub("&#?\w+;", fixup, text)
#===============================================================================

def unescape_none(s):
    return s

def unescape(s):
    if s == None:
        return s
    
    from BeautifulSoup import BeautifulStoneSoup
    
    s = BeautifulStoneSoup(s, convertEntities=BeautifulStoneSoup.HTML_ENTITIES)
    s = unicode(s)
    return s


def update_2(reqest):
    from BeautifulSoup import BeautifulStoneSoup 
    
    s = BeautifulStoneSoup("Il a dit, &lt;&lt;Sacr&eacute; bl&#101;u! Kamil P&lt;i&#281;tak &uuml; &gt;&gt;", convertEntities=BeautifulStoneSoup.XML_ENTITIES)
    print s
    
    from django.utils.html import escape
    s = escape(s)
    return HttpResponse(s)
        
    
def update_(reqest):
    s = "Dr. Jan Pi&#281;tak K&ouml;hnlein is working as software architect and consultant for itemis AG in Kiel (Germany). He has earned several years of experience in developing tools for model-driven software development. He leads the EMF Index project and commits to several other Eclipse Modeling Projects including Xtext.";
    s = unescape(s)
    from django.utils.html import escape
    
    return HttpResponse(escape(s))

def idescape(s):
    return s.replace('&', '').replace('#', '').replace(';', '')

def update__(request):
    from datetime import datetime
    d = datetime.strptime("2010-11-03 15:00:00", "%Y-%m-%d %H:%M:%S")
    print d
    
    return HttpResponse("done")

def update_4(request):
    from datetime import datetime
    d = datetime.strptime("2010-11-03 15:00:00", "%Y-%m-%d %H:%M:%S")
    print d
    s = d.strftime("%A %m, %H:%M")
    print s 
    return HttpResponse("done")

def dumpschedules():
    from django.contrib.sessions.models import Session
    for s in Session.objects.all():
        print s.get_decoded()

def update(request):
    logging.debug("dating up data base")
    #base_url = "http://www.eclipsecon.org/summiteurope2010/static/app/"
    base_url = "http://eclipsecon2011-data.webbyapp.com/"
    sessions_url = base_url + "sessions.json"
    speakers_url = base_url + "speakers.json"
    
    session_data = simplejson.load(urllib.urlopen(sessions_url))
    #speaker_data = simplejson.load(urllib.urlopen(speakers_url))
    logging.debug("data loaded")
    

#    print session_data[0].keys()
    
#    for session in Session.objects.all():
#        session.abstract = "This session has been deleted."
#        session.save()

    logging.debug("deleting %d sessions" % Session.objects.all().count())
    Session.objects.all().delete()
    
    objects = []

    for data in session_data:
        # [u'category', u'status', u'room', u'title', u'abstract', u'submissionId',
        #u'presenters', u'startTime', u'date', u'endTime', u'type', u'id', u'createdAt']
        session = Session.objects.get_or_create(pk=data['id'])[0]
        logging.debug("working on session %s" % session.session_id)
        #session = Session.objects.get_or_create(session_id=data['id'])[0]
        session.title = unescape(data['title'])
        
        session.category = unescape(data['category'])
        session.abstract = unescape(data['abstract'])
        session.room = unescape(data['room']) or ""
        
        if data['date'] and data['startTime'] and data['endTime']:
            format = "%Y-%m-%d %H:%M:%S"
            from datetime import datetime
            session.start_time = datetime.strptime("%s %s" % (data['date'], data['startTime']), format)
            session.end_time = datetime.strptime("%s %s" % (data['date'], data['endTime']), format)
        else:
            session.start_time = None
            session.end_time = None
            
        objects += [session]

    logging.debug("deleting %d speakers" % Speaker.objects.all().count())
    Speaker.objects.all().delete()

    for session in session_data:
        for data in session["presenters"]:
            # [u'category', u'status', u'room', u'title', u'abstract', u'submissionId',
            #u'presenters', u'startTime', u'date', u'endTime', u'type', u'id', u'createdAt']
            person_id = idescape(data['speakerId'])
            speaker = Speaker.objects.get_or_create(pk=person_id)[0]
        
            speaker.first_name = unescape(data["firstName"])
            speaker.last_name = unescape(data["lastName"])
            speaker.affiliation = unescape(data["affiliation"]) or ""
            speaker.bio = unescape(data["bio"]) or ""
        
            logging.debug("working on speaker %s" % speaker.speaker_id)
            objects += [speaker]        
    
    logging.debug("deleting %d relations" % Participation.objects.all().count())
    Participation.objects.all().delete()
        
    print "setting up relations"
    for data in session_data:
        session = Session.objects.get(pk=data['id'])
        logging.debug("session %s" % session.session_id)
        for presenter_data in data['presenters']:
            person_id = idescape(presenter_data['speakerId'])
            speaker = Speaker.objects.get(pk=person_id)
            logging.debug("speaker %s" % speaker.speaker_id)
            
            participation = Participation()
            participation.session = session
            participation.speaker = speaker
            objects += [participation]
            
    logging.debug("saving data")
    for obj in objects:
        logging.debug("saving %s" % obj)
        obj.save()
        
    logging.debug("done")
    
    return HttpResponse("speakers %d, sessions %d" % (Speaker.objects.count(), Session.objects.count()))
