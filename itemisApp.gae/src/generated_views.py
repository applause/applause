#from django.http import HttpResponse
from django.shortcuts import render_to_response, get_object_or_404
from models import Session, Speaker
from datetime import date, timedelta
import itertools
import logging
from django.http import HttpResponseRedirect, Http404
import content as providers

def allSpeakers(request):
    data = providers.allSpeakers()
    return render_to_response('_allSpeakers.html', {'data': data})

def speaker_resolver(request, id):
    data = providers.speakerById(id)
    return render_to_response('_speaker.html', {'data': data})

def session_resolver(request, id):
    data = providers.sessionById(id)
    return render_to_response('_session.html', {'data': data})
    