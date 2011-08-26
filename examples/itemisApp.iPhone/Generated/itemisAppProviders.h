
#import "IPContentProvider.h"

@interface itemisAppProviders : NSObject {

}

-(IPContentProvider*)providerForCompanyDescription;
-(IPContentProvider*)providerForOfficeById:(id)id;
-(IPContentProvider*)providerForCareerData;
-(IPContentProvider*)providerForJobById:(id)id;
-(IPContentProvider*)providerForCurrentTimeline;
-(IPContentProvider*)providerForEventById:(id)e;
-(IPContentProvider*)providerForPersonByName:(id)name;
-(IPContentProvider*)providerForBlogposts;
-(IPContentProvider*)providerForBlogItemById:(id)b;

@end
