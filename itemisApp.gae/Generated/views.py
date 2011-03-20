from django.shortcuts import render_to_response
import content as providers


def SessionListBySessionsByDay(request, day):
    data = providers.SessionsByDay(day)
    return render_to_response('generated/SessionList.html', {'data': data})

def SpeakersListByAllSpeakers(request):
    data = providers.AllSpeakers()
    return render_to_response('generated/SpeakersList.html', {'data': data})

def BlogDetailsByBlogItemById(request, b):
    data = providers.BlogItemById(b)
    return render_to_response('generated/BlogDetails.html', {'data': data})

def SpeakerDetailsBySpeakerByName(request, name):
    data = providers.SpeakerByName(name)
    return render_to_response('generated/SpeakerDetails.html', {'data': data})

def SessionDetailsBySessionById(request, s):
    data = providers.SessionById(s)
    return render_to_response('generated/SessionDetails.html', {'data': data})

