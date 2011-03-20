
from django.conf.urls.defaults import patterns

urlpatterns = patterns('',
    (r'^$', 'views.sessions_byDay', {"day": "2011-03-21"}),
	
    (r'^SessionList/SessionsByDay/(?P<day>.+?)/$', 'views.SessionListBySessionsByDay'),

    (r'^SpeakersList/AllSpeakers/$', 'views.SpeakersListByAllSpeakers'),

    (r'^BlogDetails/BlogItemById/(?P<b>.+?)/$', 'views.BlogDetailsByBlogItemById'),

    (r'^SpeakerDetails/SpeakerByName/(?P<name>.+?)/$', 'views.SpeakerDetailsBySpeakerByName'),

    (r'^SessionDetails/SessionById/(?P<s>.+?)/$', 'views.SessionDetailsBySessionById'),

)
