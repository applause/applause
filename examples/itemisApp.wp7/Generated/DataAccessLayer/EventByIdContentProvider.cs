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
    public class EventByIdContentProvider
    {
    	private HttpWebRequest httpWebRequest;
    	
    	public void LoadData(ContentProviderResultCallback resultCallback, Event e)
    	{
    		httpWebRequest = HttpWebRequest.CreateHttp("http://www.itemis.de/language=de/~xml.applause/" + e.Id);
    		httpWebRequest.BeginGetResponse(new AsyncCallback(FetchData), resultCallback);
    	}
    	
		void FetchData(IAsyncResult result)
        {
            HttpWebResponse response = (HttpWebResponse)httpWebRequest.EndGetResponse(result);
            XDocument xdoc = XDocument.Load(response.GetResponseStream());

            var fetchResult = 
				(from _event in xdoc.Descendants("event")
				select new Event()
				{
					Id = _event.ElementAnyNS("id") != null ? _event.ElementAnyNS("id").Value : "",
					Kind = _event.ElementAnyNS("kind") != null ? _event.ElementAnyNS("kind").Value : "",
					Title = _event.ElementAnyNS("title") != null ? _event.ElementAnyNS("title").Value : "",
					Date = _event.ElementAnyNS("date") != null ? _event.ElementAnyNS("date").Value : "",
					Location = _event.ElementAnyNS("location") != null ? _event.ElementAnyNS("location").Value : "",
					Description = _event.ElementAnyNS("description") != null ? _event.ElementAnyNS("description").Value : "",
					Contact = _event.ElementAnyNS("contact") != null ? _event.ElementAnyNS("contact").Value : "",
					Url = _event.ElementAnyNS("url") != null ? _event.ElementAnyNS("url").Value : "",
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
				});			            				
            Deployment.Current.Dispatcher.BeginInvoke(() =>
            {
                ContentProviderResultCallback callback = (ContentProviderResultCallback) result.AsyncState;
                callback(fetchResult.First());
            });
        }
    	
    }
}
