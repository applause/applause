from django.shortcuts import render_to_response
import providers


def EventListByCurrentTimeline(request):
    data = providers.CurrentTimeline()
    return render_to_response('generated/EventList.html', {'data': data})

def BlogListByBlogposts(request):
    data = providers.Blogposts()
    return render_to_response('generated/BlogList.html', {'data': data})

def OfficeListByCompanyDescription(request):
    data = providers.CompanyDescription()
    return render_to_response('generated/OfficeList.html', {'data': data})

def CareerViewByCareerData(request):
    data = providers.CareerData()
    return render_to_response('generated/CareerView.html', {'data': data})

def EventDetailsByEventById(request, id):
    data = providers.EventById(id)
    return render_to_response('generated/EventDetails.html', {'data': data})

def PersonDetailsByPersonByName(request, name):
    data = providers.PersonByName(name)
    return render_to_response('generated/PersonDetails.html', {'data': data})

def OfficeDetailsByOfficeById(request, id):
    data = providers.OfficeById(id)
    return render_to_response('generated/OfficeDetails.html', {'data': data})

def BlogDetailsByBlogItemById(request, guid):
    data = providers.BlogItemById(guid)
    return render_to_response('generated/BlogDetails.html', {'data': data})

def JobOfferDetailsByJobById(request, id):
    data = providers.JobById(id)
    return render_to_response('generated/JobOfferDetails.html', {'data': data})

