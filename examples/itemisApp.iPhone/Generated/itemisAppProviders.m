
#import "itemisAppProviders.h"
#import "IPXMLContentProvider.h"

@implementation itemisAppProviders



-(IPContentProvider*)providerForAllOffices {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://heikobehrens.net/misc/jazoon11/sanitize.php?url=", @"https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/3/public/values"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"feed.entry"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForOfficeResolver:(id)o {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/3/public/values?sq=location%3D", [[o valueForKeyPath:@"location"] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"feed.entry"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForCurrentTimeline {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://heikobehrens.net/misc/jazoon11/sanitize.php?url=", @"https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/1/public/values"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"feed.entry"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForEventById:(id)e {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://heikobehrens.net/misc/jazoon11/sanitize.php?url=", [[NSString stringWithFormat:@"%@%@", @"https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/1/public/values?sq=id==", [e valueForKeyPath:@"id"]] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"feed.entry"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForPersonByName:(id)name {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://heikobehrens.net/misc/jazoon11/sanitize.php?url=", [[NSString stringWithFormat:@"%@%@", @"https://spreadsheets.google.com/feeds/list/0Au3-oaNYhfPIdEpRQWxpZnJyX2JCNUdtT1Z4M1B4SkE/2/public/values?sq=id%3D", [[name stringByReplacingOccurrencesOfString:@" " withString:@""] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]] stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"feed.entry"
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
