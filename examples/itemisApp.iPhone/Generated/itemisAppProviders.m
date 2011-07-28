
#import "itemisAppProviders.h"
#import "IPXMLContentProvider.h"

@implementation itemisAppProviders



-(IPContentProvider*)providerForCompanyDescription {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://dl.dropbox.com/u/232067/applause-sampledata/", @"company.xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"data.company"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForOfficeById:(id)id {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://dl.dropbox.com/u/232067/applause-sampledata/", @"offices/", [id stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"offices.office"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForCarreerData {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://dl.dropbox.com/u/232067/applause-sampledata/", @"carreer.xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"data.carreer"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForJobById:(id)id {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://dl.dropbox.com/u/232067/applause-sampledata/", @"jobs/", [id stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"jobs.job"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForCurrentTimeline {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://dl.dropbox.com/u/232067/applause-sampledata/", @"timeline.xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"data.events"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForEventById:(id)e {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://dl.dropbox.com/u/232067/applause-sampledata/", @"events/", [[e valueForKeyPath:@"id"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"events.event"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForPersonByName:(id)name {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://dl.dropbox.com/u/232067/applause-sampledata/", @"contacts/", [name stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"contacts.contact"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForBlogposts {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://feedsanitizer.appspot.com", @"/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"rss.channel.item"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForSessionsByDay:(id)day {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://eclipsecon2011-data.webbyapp.com", @"/sessions/day/", day, @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"sessions.session"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForSessionById:(id)s {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://eclipsecon2011-data.webbyapp.com", @"/sessions/id/", [s valueForKeyPath:@"id"], @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"result.session"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForSpeakerById:(id)s {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://eclipsecon2011-data.webbyapp.com", @"/speakers/id/", [s valueForKeyPath:@"id"], @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"result.speaker"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForBlogItemById:(id)b {
	NSString* url = [NSString stringWithFormat:@"%@%@%@", @"http://feedsanitizer.appspot.com", @"/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss&id=", [[b valueForKeyPath:@"guid"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"rss.channel.item"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForAllSpeakers {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://eclipsecon2011-data.webbyapp.com", @"/speakers.xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"speakers.speaker"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForSpeakerByName:(id)name {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://eclipsecon2011-data.webbyapp.com", @"/speakers/name/", [name stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"result.speaker"
								  andProviders:self] autorelease];
	return result;
}


@end
