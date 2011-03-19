#from django.http import HttpResponse
from django.shortcuts import render_to_response, get_object_or_404
from models import Session, Speaker
from datetime import date, timedelta
import itertools
import logging
from django.http import HttpResponseRedirect, Http404

menu_sessions = 0
menu_mySchedule = 1
menu_speakers = 2
menu_maps = 3

cookie_schedule = "schedule"
cookie_useragent = "useragent"

startOfConference = date(2011, 03, 21)
endOfConference = date(2011, 03, 24)

def normalizedDay(day):
    currentDayOfConference =  (date.today() - startOfConference).days
    latest = (endOfConference - startOfConference).days;
    
    # ensure day is valid and provide default if needed
    if day==None:
        day = currentDayOfConference
    day = int(day)
        
    if day<0:
        day = 0

    if day>latest:
        day = latest

    return day;

def sessionsForDay(day):
    filterDate = startOfConference + timedelta(day)
    return Session.objects.all().filter(start_time__gte= filterDate, start_time__lt= filterDate+timedelta(1)).order_by('start_time')

def schedule(request):
    return request.session.get(cookie_schedule, set())

def setSchedule(request, schedule):
    request.session[cookie_useragent] = request.META['HTTP_USER_AGENT'] 
    request.session[cookie_schedule] = schedule
    
def log_session(request):
    logging.info("session: " + request.session.session_key)
    logging.info(schedule(request))
    
def sessionsWithFilter(request, onlyFavorites, day=None):
    log_session(request)
    day = normalizedDay(day)
    context =  {'mainmenu_selected': menu_sessions, 'day': day, 'display_favorites': onlyFavorites}    

    sessions = sessionsForDay(day)
    if onlyFavorites:
        logging.debug("only favorites!")
        context['mainmenu_selected'] = menu_mySchedule        
        favorites = schedule(request)
        logging.debug("favorites %s" % favorites)

        sessions = [s for s in sessions if s.session_id in favorites]
    
    # constructs a a list of dictionaries per timeslot
    slots = []
    for k, g in itertools.groupby(sessions, lambda x: x.timeslot_short()):
        slots.append({"title" : k, "sessions": [p for p in g]})
        
    context['timeslots'] =  slots    
    
    # handle format ?format=xml
    template = 'sessions.' + request.GET.get('format', 'html')
    return render_to_response(template, context)  


def session_favorites(request, day=None):
    return sessionsWithFilter(request, True, day)

def session_all(request, day=None):
    return sessionsWithFilter(request, False, day)

def session_details(request, id):
    log_session(request)
    obj = get_object_or_404(Session, pk=id)
    next = request.path
    template = 'session.' + request.GET.get('format', 'html')
    return render_to_response(template, {'nextIfChanged':next, 'mainmenu_selected': menu_sessions, 'session': obj, 'isFavorite': obj.session_id in schedule(request)})

def session_add(request, id):
    setSchedule(request, schedule(request) | set([id]))
    return HttpResponseRedirect(request.GET.get('next', '/'))
    #return HttpResponseRedirect(request.GET.get('next', '/'))

def session_remove(request, id):
    setSchedule(request, schedule(request) - set([id]))
    return HttpResponseRedirect(request.GET.get('next', '/'))

def speaker_all(request):
    log_session(request)
    list = Speaker.objects.all().order_by('last_name')
    
    # constructs a a list of dictionaries per first_letter
    groups = []
    for k, g in itertools.groupby(list, lambda x: x.first_letter()):
        groups.append({"title" : k, "speakers": [p for p in g]})    
        
    # handle format ?format=xml
    template = 'speakers.' + request.GET.get('format', 'html')
    return render_to_response(template, {'mainmenu_selected': menu_speakers, 'speaker_groups': groups})

def speaker_details(request, id):
    log_session(request)
    obj = get_object_or_404(Speaker, pk=id)
    # handle format ?format=xml
    template = 'speaker.' + request.GET.get('format', 'html')
    return render_to_response(template, {'mainmenu_selected': menu_speakers, 'speaker': obj})

def speaker_details_by_name(request, name):
    speaker = None
    for s in Speaker.objects.all():
        if s.full_name() == name:
            speaker = s
            break
    
    if speaker == None:
        raise Http404('No Speaker matches %s.' % name)
    
    # handle format ?format=xml
    template = 'speaker.' + request.GET.get('format', 'html')
    return render_to_response(template, {'mainmenu_selected': menu_speakers, 'speaker': speaker})
