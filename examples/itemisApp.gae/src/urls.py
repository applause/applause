
from django.conf.urls.defaults import patterns

urlpatterns = patterns('',
	
    (r'^$', 'views.EventListByCurrentTimeline', {}),
    
	
    (r'^EventList/CurrentTimeline/$', 'views.EventListByCurrentTimeline'),

    (r'^BlogList/Blogposts/$', 'views.BlogListByBlogposts'),

    (r'^OfficeList/CompanyDescription/$', 'views.OfficeListByCompanyDescription'),

    (r'^CareerView/CareerData/$', 'views.CareerViewByCareerData'),

    (r'^EventDetails/EventById/(?P<id>.+?)/$', 'views.EventDetailsByEventById'),

    (r'^PersonDetails/PersonByName/(?P<name>.+?)/$', 'views.PersonDetailsByPersonByName'),

    (r'^OfficeDetails/OfficeById/(?P<id>.+?)/$', 'views.OfficeDetailsByOfficeById'),

    (r'^BlogDetails/BlogItemById/(?P<guid>.+?)/$', 'views.BlogDetailsByBlogItemById'),

    (r'^JobOfferDetails/JobById/(?P<id>.+?)/$', 'views.JobOfferDetailsByJobById'),

)
