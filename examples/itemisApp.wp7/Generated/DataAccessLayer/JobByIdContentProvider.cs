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
    public class JobByIdContentProvider
    {
    	private HttpWebRequest httpWebRequest;
    	
    	public void LoadData(ContentProviderResultCallback resultCallback, string id)
    	{
    		httpWebRequest = HttpWebRequest.CreateHttp("http://www.itemis.de/language=de/~xml.applause/" + id);
    		httpWebRequest.BeginGetResponse(new AsyncCallback(FetchData), resultCallback);
    	}
    	
		void FetchData(IAsyncResult result)
        {
            HttpWebResponse response = (HttpWebResponse)httpWebRequest.EndGetResponse(result);
            XDocument xdoc = XDocument.Load(response.GetResponseStream());

            var fetchResult = 
				(from _jobOffer in xdoc.Descendants("job")
				select new JobOffer()
				{
					Id = _jobOffer.ElementAnyNS("id") != null ? _jobOffer.ElementAnyNS("id").Value : "",
					Location = _jobOffer.ElementAnyNS("location") != null ? _jobOffer.ElementAnyNS("location").Value : "",
					Title = _jobOffer.ElementAnyNS("title") != null ? _jobOffer.ElementAnyNS("title").Value : "",
					Description = _jobOffer.ElementAnyNS("description") != null ? _jobOffer.ElementAnyNS("description").Value : "",
					Contact = _jobOffer.ElementAnyNS("contact") != null ? _jobOffer.ElementAnyNS("contact").Value : ""
				});			            				
            Deployment.Current.Dispatcher.BeginInvoke(() =>
            {
                ContentProviderResultCallback callback = (ContentProviderResultCallback) result.AsyncState;
                callback(fetchResult.First());
            });
        }
    	
    }
}
