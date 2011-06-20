
#import "IPContentProvider.h"

@interface itemisAppProviders : NSObject {

}

-(IPContentProvider*)providerForAllOffices;
-(IPContentProvider*)providerForOfficeResolver:(id)o;
-(IPContentProvider*)providerForCurrentTimeline;
-(IPContentProvider*)providerForEventById:(id)e;
-(IPContentProvider*)providerForPersonByName:(id)name;
-(IPContentProvider*)providerForBlogposts;
-(IPContentProvider*)providerForSessionsByDay:(id)day;
-(IPContentProvider*)providerForSessionById:(id)s;
-(IPContentProvider*)providerForSpeakerById:(id)s;
-(IPContentProvider*)providerForBlogItemById:(id)b;
-(IPContentProvider*)providerForAllSpeakers;
-(IPContentProvider*)providerForSpeakerByName:(id)name;

@end
