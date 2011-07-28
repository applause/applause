
#import "IPContentProvider.h"

@interface itemisAppProviders : NSObject {

}

-(IPContentProvider*)providerForCompanyDescription;
-(IPContentProvider*)providerForOfficeById:(id)id;
-(IPContentProvider*)providerForCarreerData;
-(IPContentProvider*)providerForJobById:(id)id;
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
