from django.conf.urls.defaults import *

handler500 = 'djangotoolbox.errorviews.server_error'

urlpatterns = patterns('',
    (r'^$', 'generated_views.sessions_byDay', {"day": "2011-03-21"}),
    
    (r'^allSpeakers/$', 'generated_views.allSpeakers'),
    
    (r'^speaker/id/(?P<id>.+?)/$', 'generated_views.speaker_resolver'),
    
    (r'^speaker/name/(?P<name>.+?)/$', 'generated_views.speaker_byName'),

    (r'^session/id/(?P<id>.+?)/$', 'generated_views.session_resolver'),
    
    (r'^sessions/day/(?P<day>.+?)/$', 'generated_views.sessions_byDay'),
)
