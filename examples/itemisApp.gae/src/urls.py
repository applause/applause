
from django.conf.urls.defaults import patterns

urlpatterns = patterns('',
	
    (r'^$', 'views.OfficeListByCompanyDescription', {}),
    
	
    (r'^OfficeList/CompanyDescription/$', 'views.OfficeListByCompanyDescription'),

    (r'^EventDetails/__EventById/(?P<id>.+?)/$', 'views.EventDetailsBy__EventById'),

    (r'^EventList/CurrentTimeline/$', 'views.EventListByCurrentTimeline'),

    (r'^BlogList/Blogposts/$', 'views.BlogListByBlogposts'),

    (r'^CarreerView/CarreerData/$', 'views.CarreerViewByCarreerData'),

    (r'^EventDetails/EventById/(?P<id>.+?)/$', 'views.EventDetailsByEventById'),

    (r'^PersonDetails/PersonByName/(?P<name>.+?)/$', 'views.PersonDetailsByPersonByName'),

    (r'^OfficeDetails/OfficeResolver/(?P<location>.+?)/$', 'views.OfficeDetailsByOfficeResolver'),

    (r'^BlogDetails/BlogItemById/(?P<guid>.+?)/$', 'views.BlogDetailsByBlogItemById'),

    (r'^JobOfferDetails/JobById/(?P<id>.+?)/$', 'views.JobOfferDetailsByJobById'),

)
