
#import "itemisAppProviders.h"
#import "IPXMLContentProvider.h"

@implementation itemisAppProviders



-(IPContentProvider*)providerForCompanyDescription {
	NSString* url = @"http://www.itemis.de/language=de/~xml.company/37606";
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"data.company"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForOfficeById:(id)id {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://www.itemis.de/language=de/~xml.applause/", id];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"offices.office"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForCareerData {
	NSString* url = @"http://www.itemis.de/language=de/~xml.carreer/37606";
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"data.carreer"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForJobById:(id)id {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://www.itemis.de/language=de/~xml.applause/", id];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"jobs.job"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForCurrentTimeline {
	NSString* url = @"http://www.itemis.de/language=de/~xml.timeline/37606";
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"data.events"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForEventById:(id)e {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://www.itemis.de/language=de/~xml.applause/", [e valueForKeyPath:@"id"]];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"events.event"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForPersonByName:(id)name {
	NSString* url = [NSString stringWithFormat:@"%@%@%@", @"http://www.itemis.de/applause/people/de/", [name stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".xml"];
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



-(IPContentProvider*)providerForBlogItemById:(id)b {
	NSString* url = [NSString stringWithFormat:@"%@%@%@", @"http://feedsanitizer.appspot.com", @"/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss&id=", [[b valueForKeyPath:@"guid"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"rss.channel.item"
								  andProviders:self] autorelease];
	return result;
}


@end
