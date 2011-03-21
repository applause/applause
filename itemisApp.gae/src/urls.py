
from django.conf.urls.defaults import patterns

urlpatterns = patterns('',
	
    (r'^$', 'views.SessionListBySessionsByDay', {'day': '2011-03-22'}),
    
	
    (r'^SessionList/SessionsByDay/(?P<day>.+?)/$', 'views.SessionListBySessionsByDay'),

    (r'^SpeakersList/AllSpeakers/$', 'views.SpeakersListByAllSpeakers'),

    (r'^BlogDetails/BlogItemById/(?P<link>.+?)/$', 'views.BlogDetailsByBlogItemById'),

    (r'^SpeakerDetails/SpeakerByName/(?P<name>.+?)/$', 'views.SpeakerDetailsBySpeakerByName'),

    (r'^SessionDetails/SessionById/(?P<id>.+?)/$', 'views.SessionDetailsBySessionById'),

)
