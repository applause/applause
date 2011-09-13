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
    public class CareerDataContentProvider
    {
    	private HttpWebRequest httpWebRequest;
    	
    	public void LoadData(ContentProviderResultCallback resultCallback)
    	{
    		httpWebRequest = HttpWebRequest.CreateHttp("http://www.itemis.de/language=de/~xml.carreer/37606");
    		httpWebRequest.BeginGetResponse(new AsyncCallback(FetchData), resultCallback);
    	}
    	
		void FetchData(IAsyncResult result)
        {
            HttpWebResponse response = (HttpWebResponse)httpWebRequest.EndGetResponse(result);
            XDocument xdoc = XDocument.Load(response.GetResponseStream());

            var fetchResult = 
				(from _career in xdoc.Descendants("carreer")
				select new Career()
				{
					Description = _career.ElementAnyNS("description") != null ? _career.ElementAnyNS("description").Value : "",
					Link = 
							(from _link in xdoc.Descendants("link")
							select new Link()
							{
								Title = _link.ElementAnyNS("title") != null ? _link.ElementAnyNS("title").Value : "",
								Url = _link.ElementAnyNS("url") != null ? _link.ElementAnyNS("url").Value : ""
							}).ToList(),
					Job = 
							(from _job in xdoc.Descendants("job")
							select new JobOffer()
							{
								Id = _job.ElementAnyNS("id") != null ? _job.ElementAnyNS("id").Value : "",
								Location = _job.ElementAnyNS("location") != null ? _job.ElementAnyNS("location").Value : "",
								Title = _job.ElementAnyNS("title") != null ? _job.ElementAnyNS("title").Value : "",
								Description = _job.ElementAnyNS("description") != null ? _job.ElementAnyNS("description").Value : "",
								Contact = _job.ElementAnyNS("contact") != null ? _job.ElementAnyNS("contact").Value : ""
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
