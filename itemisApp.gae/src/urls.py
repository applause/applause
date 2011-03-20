from django.conf.urls.defaults import patterns

urlpatterns = patterns('',
    (r'^$', 'views.sessions_byDay', {"day": "2011-03-21"}),
    
    (r'^allSpeakers/$', 'views.allSpeakers'),
    
    (r'^speaker/id/(?P<id>.+?)/$', 'views.speaker_resolver'),
    
    (r'^speaker/name/(?P<name>.+?)/$', 'views.speaker_byName'),

    (r'^session/id/(?P<id>.+?)/$', 'views.session_resolver'),
    
    (r'^sessions/day/(?P<day>.+?)/$', 'views.sessions_byDay'),
)
