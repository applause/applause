#import "IPContentProvider.h"

@interface itemisAppProviders : NSObject {

}

-(IPContentProvider*)providerForBlogposts;
-(IPContentProvider*)providerForSessionsByDay:(id)day;
-(IPContentProvider*)providerForSessionById:(id)s;
-(IPContentProvider*)providerForSpeakerById:(id)s;
-(IPContentProvider*)providerForBlogItemById:(id)b;
-(IPContentProvider*)providerForAllSpeakers;
-(IPContentProvider*)providerForSpeakerByName:(id)name;

@end
