
#import "IPContentProvider.h"

@interface itemisAppProviders : NSObject {

}

-(IPContentProvider*)providerForCompanyDescription;
-(IPContentProvider*)providerForAllOffices;
-(IPContentProvider*)providerForOfficeResolver:(id)o;
-(IPContentProvider*)providerForCarreerData;
-(IPContentProvider*)providerForJobById:(id)id;
-(IPContentProvider*)providerForCurrentTimeline;
-(IPContentProvider*)providerFor__EventById:(id)id;
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
