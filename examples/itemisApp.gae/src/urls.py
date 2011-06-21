
from django.conf.urls.defaults import patterns

urlpatterns = patterns('',
	
    (r'^$', 'views.EventListByCurrentTimeline', {}),
    
	
    (r'^EventList/CurrentTimeline/$', 'views.EventListByCurrentTimeline'),

    (r'^BlogList/Blogposts/$', 'views.BlogListByBlogposts'),

    (r'^OfficeList/AllOffices/$', 'views.OfficeListByAllOffices'),

    (r'^EventDetails/EventById/(?P<id>.+?)/$', 'views.EventDetailsByEventById'),

    (r'^PersonDetails/PersonByName/(?P<name>.+?)/$', 'views.PersonDetailsByPersonByName'),

    (r'^OfficeDetails/OfficeResolver/(?P<location>.+?)/$', 'views.OfficeDetailsByOfficeResolver'),

    (r'^BlogDetails/BlogItemById/(?P<guid>.+?)/$', 'views.BlogDetailsByBlogItemById'),

)
