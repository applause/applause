
#import "itemisAppProviders.h"
#import "IPXMLContentProvider.h"

@implementation itemisAppProviders



-(IPContentProvider*)providerForallCommitsByRepository:(id)path {
	NSString* url = [NSString stringWithFormat:@"%@%@%@", @"http://github.com/api/v2/xml/commits/list/", path, @"/master"];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"commits.commit"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForuserData:(id)login {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://github.com/api/v2/xml/user/search/", login];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"users.user"
								  andProviders:self] autorelease];
	return result;
}



-(IPContentProvider*)providerForallRepositoriesByUser:(id)login {
	NSString* url = [NSString stringWithFormat:@"%@%@", @"http://github.com/api/v2/xml/repos/show/", login];
	IPContentProvider *result = [[[IPXMLContentProvider alloc] 
								  initWithURL: [NSURL URLWithString:url] 
								  initialContent: nil
								  keyPathToContent: @"repositories.repository"
								  andProviders:self] autorelease];
	return result;
}


@end
