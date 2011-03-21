
from django.conf.urls.defaults import patterns

urlpatterns = patterns('',
	
    (r'^$', 'views.BlogListByBlogposts', {}),
    
	
    (r'^BlogList/Blogposts/$', 'views.BlogListByBlogposts'),

    (r'^SessionList/SessionsByDay/(?P<day>.+?)/$', 'views.SessionListBySessionsByDay'),

    (r'^SpeakersList/AllSpeakers/$', 'views.SpeakersListByAllSpeakers'),

    (r'^BlogDetails/BlogItemById/(?P<guid>.+?)/$', 'views.BlogDetailsByBlogItemById'),

    (r'^SpeakerDetails/SpeakerByName/(?P<name>.+?)/$', 'views.SpeakerDetailsBySpeakerByName'),

    (r'^SessionDetails/SessionById/(?P<id>.+?)/$', 'views.SessionDetailsBySessionById'),

)
