
#import "itemisAppProviders.h"
#import "IPXMLContentProvider.h"

@implementation itemisAppProviders



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
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://localhost:3000", @"/sessions/day/", day, @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"sessions.session"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForSessionById:(id)s {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://localhost:3000", @"/sessions/id/", [s valueForKeyPath:@"id"], @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"result.session"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForSpeakerById:(id)s {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://localhost:3000", @"/speakers/id/", [s valueForKeyPath:@"id"], @".xml"];
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
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://localhost:3000", @"/speakers.xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"speakers.speaker"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForSpeakerByName:(id)name {
	NSString* url = [NSString stringWithFormat:@"%@%@%@%@", @"http://localhost:3000", @"/speakers/name/", [name stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding], @".xml"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"result.speaker"
								  andProviders:self] autorelease];
	return result;
}


@end
