using System;
using System.Linq;
using System.Net;
using System.Windows;
using System.Xml.Linq;
using Applause.DataAccessLayer;
using Applause.Extensions;
using ItemisApp.Model;

namespace ItemisApp.DataAccessLayer    
{
    public class CurrentTimelineContentProvider
    {
    	private HttpWebRequest httpWebRequest;
    	
    	public void LoadData(ContentProviderResultCallback resultCallback)
    	{
    		httpWebRequest = HttpWebRequest.CreateHttp("http://www.itemis.de/language=de/~xml.timeline/37606");
    		httpWebRequest.BeginGetResponse(new AsyncCallback(FetchData), resultCallback);
    	}
    	
		void FetchData(IAsyncResult result)
        {
            HttpWebResponse response = (HttpWebResponse)httpWebRequest.EndGetResponse(result);
            XDocument xdoc = XDocument.Load(response.GetResponseStream());

            var fetchResult = 
				(from _allEvents in xdoc.Descendants("events")
				select new AllEvents()
				{
					News = 
							(from _news in xdoc.Descendants("news")
							select new Event()
							{
								Id = _news.ElementAnyNS("id") != null ? _news.ElementAnyNS("id").Value : "",
								Kind = _news.ElementAnyNS("kind") != null ? _news.ElementAnyNS("kind").Value : "",
								Title = _news.ElementAnyNS("title") != null ? _news.ElementAnyNS("title").Value : "",
								Date = _news.ElementAnyNS("date") != null ? _news.ElementAnyNS("date").Value : "",
								Location = _news.ElementAnyNS("location") != null ? _news.ElementAnyNS("location").Value : "",
								Description = _news.ElementAnyNS("description") != null ? _news.ElementAnyNS("description").Value : "",
								Contact = _news.ElementAnyNS("contact") != null ? _news.ElementAnyNS("contact").Value : "",
								Url = _news.ElementAnyNS("url") != null ? _news.ElementAnyNS("url").Value : "",
								Speakers = 
										(from _speakers in xdoc.Descendants("speakers")
										select new Contact()
										{
											Name = _speakers.ElementAnyNS("name") != null ? _speakers.ElementAnyNS("name").Value : "",
											Role = _speakers.ElementAnyNS("role") != null ? _speakers.ElementAnyNS("role").Value : "",
											Bio = _speakers.ElementAnyNS("bio") != null ? _speakers.ElementAnyNS("bio").Value : "",
											Pictureurl = _speakers.ElementAnyNS("pictureurl") != null ? _speakers.ElementAnyNS("pictureurl").Value : "",
											Mail = _speakers.ElementAnyNS("mail") != null ? _speakers.ElementAnyNS("mail").Value : "",
											Phone = _speakers.ElementAnyNS("phone") != null ? _speakers.ElementAnyNS("phone").Value : "",
											Webaddresses = 
													(from _webaddresses in xdoc.Descendants("webaddresses")
													select new WebAddress()
													{
														Title = _webaddresses.ElementAnyNS("title") != null ? _webaddresses.ElementAnyNS("title").Value : "",
														Url = _webaddresses.ElementAnyNS("url") != null ? _webaddresses.ElementAnyNS("url").Value : ""
													}).ToList()
										}).ToList()
							}).ToList(),
					Activity = 
							(from _activity in xdoc.Descendants("activity")
							select new Event()
							{
								Id = _activity.ElementAnyNS("id") != null ? _activity.ElementAnyNS("id").Value : "",
								Kind = _activity.ElementAnyNS("kind") != null ? _activity.ElementAnyNS("kind").Value : "",
								Title = _activity.ElementAnyNS("title") != null ? _activity.ElementAnyNS("title").Value : "",
								Date = _activity.ElementAnyNS("date") != null ? _activity.ElementAnyNS("date").Value : "",
								Location = _activity.ElementAnyNS("location") != null ? _activity.ElementAnyNS("location").Value : "",
								Description = _activity.ElementAnyNS("description") != null ? _activity.ElementAnyNS("description").Value : "",
								Contact = _activity.ElementAnyNS("contact") != null ? _activity.ElementAnyNS("contact").Value : "",
								Url = _activity.ElementAnyNS("url") != null ? _activity.ElementAnyNS("url").Value : "",
								Speakers = 
										(from _speakers in xdoc.Descendants("speakers")
										select new Contact()
										{
											Name = _speakers.ElementAnyNS("name") != null ? _speakers.ElementAnyNS("name").Value : "",
											Role = _speakers.ElementAnyNS("role") != null ? _speakers.ElementAnyNS("role").Value : "",
											Bio = _speakers.ElementAnyNS("bio") != null ? _speakers.ElementAnyNS("bio").Value : "",
											Pictureurl = _speakers.ElementAnyNS("pictureurl") != null ? _speakers.ElementAnyNS("pictureurl").Value : "",
											Mail = _speakers.ElementAnyNS("mail") != null ? _speakers.ElementAnyNS("mail").Value : "",
											Phone = _speakers.ElementAnyNS("phone") != null ? _speakers.ElementAnyNS("phone").Value : "",
											Webaddresses = 
													(from _webaddresses in xdoc.Descendants("webaddresses")
													select new WebAddress()
													{
														Title = _webaddresses.ElementAnyNS("title") != null ? _webaddresses.ElementAnyNS("title").Value : "",
														Url = _webaddresses.ElementAnyNS("url") != null ? _webaddresses.ElementAnyNS("url").Value : ""
													}).ToList()
										}).ToList()
							}).ToList(),
					Workshop = 
							(from _workshop in xdoc.Descendants("workshop")
							select new Event()
							{
								Id = _workshop.ElementAnyNS("id") != null ? _workshop.ElementAnyNS("id").Value : "",
								Kind = _workshop.ElementAnyNS("kind") != null ? _workshop.ElementAnyNS("kind").Value : "",
								Title = _workshop.ElementAnyNS("title") != null ? _workshop.ElementAnyNS("title").Value : "",
								Date = _workshop.ElementAnyNS("date") != null ? _workshop.ElementAnyNS("date").Value : "",
								Location = _workshop.ElementAnyNS("location") != null ? _workshop.ElementAnyNS("location").Value : "",
								Description = _workshop.ElementAnyNS("description") != null ? _workshop.ElementAnyNS("description").Value : "",
								Contact = _workshop.ElementAnyNS("contact") != null ? _workshop.ElementAnyNS("contact").Value : "",
								Url = _workshop.ElementAnyNS("url") != null ? _workshop.ElementAnyNS("url").Value : "",
								Speakers = 
										(from _speakers in xdoc.Descendants("speakers")
										select new Contact()
										{
											Name = _speakers.ElementAnyNS("name") != null ? _speakers.ElementAnyNS("name").Value : "",
											Role = _speakers.ElementAnyNS("role") != null ? _speakers.ElementAnyNS("role").Value : "",
											Bio = _speakers.ElementAnyNS("bio") != null ? _speakers.ElementAnyNS("bio").Value : "",
											Pictureurl = _speakers.ElementAnyNS("pictureurl") != null ? _speakers.ElementAnyNS("pictureurl").Value : "",
											Mail = _speakers.ElementAnyNS("mail") != null ? _speakers.ElementAnyNS("mail").Value : "",
											Phone = _speakers.ElementAnyNS("phone") != null ? _speakers.ElementAnyNS("phone").Value : "",
											Webaddresses = 
													(from _webaddresses in xdoc.Descendants("webaddresses")
													select new WebAddress()
													{
														Title = _webaddresses.ElementAnyNS("title") != null ? _webaddresses.ElementAnyNS("title").Value : "",
														Url = _webaddresses.ElementAnyNS("url") != null ? _webaddresses.ElementAnyNS("url").Value : ""
													}).ToList()
										}).ToList()
							}).ToList()
				});			            				
            Deployment.Current.Dispatcher.BeginInvoke(() =>
            {
                ContentProviderResultCallback callback = (ContentProviderResultCallback) result.AsyncState;
                callback(fetchResult.First());
            });
        }
    	
    }
}
