//
//  IPAbstractTableViewController.m
//  itemisApp
//
//  Created by Heiko Behrens on 24.01.10.
//  Copyright 2010 itemis AG. All rights reserved.
//

#import "IPAbstractTableViewController.h"
#import "ASIHTTPRequest.h"
#import "TTGlobalNetwork.h"
#import "IPCache.h"

@implementation IPAbstractTableViewController

@synthesize loadingView;

-(void)setContentProvider:(IPContentProvider*)value {
	[self unbindFromContentProvider];
	[contentProvider release];
	
	contentProvider = [value retain];
	[self bindToContentProvider];
	if(contentProvider.content)
		[self updateData];
}


-(IPContentProvider*)contentProvider {
	return contentProvider;
}

- (UIImage*)getImage:(NSString*) url withLoadingImage:(NSString*)loadingImage andErrorImage:(NSString*)errorImage {
	if(!url)
		return [UIImage imageNamed:errorImage];

	UIImage *image = [loadedImages valueForKey: url];
	if(image) 
		return image;
	
	NSData *data = [IPCache cachedObjectForURL: url];
	if(data) {
		image = [UIImage imageWithData:data];
		[loadedImages setValue:image forKey: url];
		return image;
	}
	
	ASIHTTPRequest *request = [ASIHTTPRequest requestWithURL: [NSURL URLWithString: url]];
	NSLog(@"loading image %@", url);
	request.delegate = self;
	TTNetworkRequestStarted();
	[request startAsynchronous];
	
	image = [UIImage imageNamed: loadingImage];
	[errorImageNames setValue:errorImage forKey: url];
	[loadedImages setValue:image forKey: url];
	
	return image;
}

- (void)updateImage:(UIImage*)image forKey:(NSString*)key {
	[loadedImages setValue:image forKey: key];
	
	[self updateData];
}

- (void)requestFailed:(ASIHTTPRequest *)request
{
	TTNetworkRequestStopped();
	NSString *url = request.url.absoluteString;
	[self updateImage:[UIImage imageNamed:[errorImageNames objectForKey: url]] forKey: url];
	[errorImageNames removeObjectForKey:url];
}

+ (UIImage *)scale:(UIImage *)image toSize:(CGSize)size
{
    UIGraphicsBeginImageContext(size);
    [image drawInRect:CGRectMake(0, 0, size.width, size.height)];
    UIImage *scaledImage = UIGraphicsGetImageFromCurrentImageContext();
    UIGraphicsEndImageContext();
    return scaledImage;
}

- (void)requestFinished:(ASIHTTPRequest *)request
{
	TTNetworkRequestStopped();
	if(request.responseStatusCode == 404)
		[self requestFailed:request];
	else {	
		UIImage *orignalImage = [UIImage imageWithData: request.responseData];
		UIImage *image = [self.class scale:orignalImage toSize: CGSizeMake(45, 60)];
		[IPCache cacheObject:request.responseData forURL:request.url.absoluteString];
		[self updateImage:image forKey: request.url.absoluteString];
	}
}

- (id)initWithStyle:(UITableViewStyle)style {
    if (self = [super initWithStyle:style]) {
		loadedImages = [[NSMutableDictionary alloc] init];
		errorImageNames = [[NSMutableDictionary alloc] init];
    }
    return self;
}

-(IPLoadingView*)createLoadingView {
	return [IPLoadingView loadingViewInView:self.view];
}

-(void)showLoadingView {
	if(self.loadingView)
		return;
	self.loadingView = [self createLoadingView];
}

-(void)hideLoadingView {
	if(!self.loadingView)
		return;
	[self.loadingView removeView];
	self.loadingView = nil;
}

-(void)updateLoadingView {
	if(contentProvider.loading)
		[self showLoadingView];
	else
		[self hideLoadingView];
}

-(void)updateData {
	[self updateLoadingView];
	[self.tableView reloadData];
}

-(UITableViewCell*)cellDefaultForTableView:(UITableView *)tableView {
	static NSString *CellIdentifier = @"CellDefault";
    
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier];
    if (cell == nil) {
        cell = [[[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:CellIdentifier] autorelease];
    }
	return cell;
}

-(UITableViewCell*)cellDoubleForTableView:(UITableView *)tableView {
	static NSString *CellIdentifier = @"CellDouble";

	UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier];
	if (cell == nil) {
		cell = [[[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:CellIdentifier] autorelease];
		cell.textLabel.font = [UIFont fontWithName:cell.textLabel.font.fontName size:12];
		cell.textLabel.lineBreakMode = UILineBreakModeWordWrap;
		cell.textLabel.numberOfLines = 2;
	}
	return cell;
}

-(UITableViewCell*)cellSubtitleForTableView:(UITableView *)tableView {
	static NSString *CellIdentifier = @"CellSubtitle";

	UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier];
	if (cell == nil) {
		cell = [[[UITableViewCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:CellIdentifier] autorelease];
	}
	return cell;
	
}


-(UITableViewCell*)cellDefaultWithDisclosureForTableView:(UITableView *)tableView {
	static NSString *CellIdentifier = @"CellDefaultWithDisclosure";
    
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier];
    if (cell == nil) {
        cell = [[[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:CellIdentifier] autorelease];
		cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
    }
	return cell;
}

-(UITableViewCell*)cellValue2ForTableView:(UITableView *)tableView {
	static NSString *CellIdentifier = @"CellValue2Default";
    
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier];
    if (cell == nil) {
        cell = [[[UITableViewCell alloc] initWithStyle:UITableViewCellStyleValue2 reuseIdentifier:CellIdentifier] autorelease];
    }
	return cell;
}


- (void)viewDidAppear:(BOOL)animated {
    [super viewDidAppear:animated];
	[self updateData];
	[self.contentProvider requestContentIfEmpty];
}

/*
- (void)viewWillDisappear:(BOOL)animated {
	[super viewWillDisappear:animated];
}
*/
/*
- (void)viewDidDisappear:(BOOL)animated {
	[super viewDidDisappear:animated];
}
*/

/*
// Override to allow orientations other than the default portrait orientation.
- (BOOL)shouldAutorotateToInterfaceOrientation:(UIInterfaceOrientation)interfaceOrientation {
    // Return YES for supported orientations
    return (interfaceOrientation == UIInterfaceOrientationPortrait);
}
*/

- (void)didReceiveMemoryWarning {
	[IPCache purgeCache];
    [super didReceiveMemoryWarning];
	[loadedImages removeAllObjects];
}

- (void)viewDidUnload {
	// Release any retained subviews of the main view.
	// e.g. self.myOutlet = nil;
}


#pragma mark Table view methods

- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	if(!contentProvider || !contentProvider.content || contentProvider.loading)
		return 0;
	else
    	return 1;
}


// Customize the number of rows in the table view.
- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    return 0;
}


// Customize the appearance of table view cells.
- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
    
    static NSString *CellIdentifier = @"Cell";
    
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier];
    if (cell == nil) {
        cell = [[[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:CellIdentifier] autorelease];
    }
    
    // Set up the cell...
	
    return cell;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
    // Navigation logic may go here. Create and push another view controller.
	// AnotherViewController *anotherViewController = [[AnotherViewController alloc] initWithNibName:@"AnotherView" bundle:nil];
	// [self.navigationController pushViewController:anotherViewController];
	// [anotherViewController release];
}


/*
// Override to support conditional editing of the table view.
- (BOOL)tableView:(UITableView *)tableView canEditRowAtIndexPath:(NSIndexPath *)indexPath {
    // Return NO if you do not want the specified item to be editable.
    return YES;
}
*/


/*
// Override to support editing the table view.
- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath {
    
    if (editingStyle == UITableViewCellEditingStyleDelete) {
        // Delete the row from the data source
        [tableView deleteRowsAtIndexPaths:[NSArray arrayWithObject:indexPath] withRowAnimation:YES];
    }   
    else if (editingStyle == UITableViewCellEditingStyleInsert) {
        // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view
    }   
}
*/


/*
// Override to support rearranging the table view.
- (void)tableView:(UITableView *)tableView moveRowAtIndexPath:(NSIndexPath *)fromIndexPath toIndexPath:(NSIndexPath *)toIndexPath {
}
*/


/*
// Override to support conditional rearranging of the table view.
- (BOOL)tableView:(UITableView *)tableView canMoveRowAtIndexPath:(NSIndexPath *)indexPath {
    // Return NO if you do not want the item to be re-orderable.
    return YES;
}
*/

-(void)unbindFromContentProvider {
	[self.contentProvider removeObserver:self forKeyPath:@"content"];
	[self.contentProvider removeObserver:self forKeyPath:@"loading"];
}

-(void)bindToContentProvider {
	[self.contentProvider addObserver:self forKeyPath:@"content" options:NSKeyValueObservingOptionNew context:nil];
	[self.contentProvider addObserver:self forKeyPath:@"loading" options:NSKeyValueObservingOptionNew context:nil];
}

- (void)observeValueForKeyPath:(NSString *)keyPath
					  ofObject:(id)object
                        change:(NSDictionary *)change
                       context:(void *)context {
	if([@"loading" isEqualToString:keyPath])
		[self updateLoadingView];
	else
		[self updateData];
}

- (void)dealloc {
	[loadedImages release];
	[errorImageNames release];
	self.contentProvider = nil;
    [super dealloc];
}


@end

