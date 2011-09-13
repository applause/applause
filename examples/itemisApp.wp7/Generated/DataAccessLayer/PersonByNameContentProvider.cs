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
    public class PersonByNameContentProvider
    {
    	private HttpWebRequest httpWebRequest;
    	
    	public void LoadData(ContentProviderResultCallback resultCallback, string name)
    	{
    		httpWebRequest = HttpWebRequest.CreateHttp("http://www.itemis.de/applause/people/de/" + name.URLEncode() + ".xml");
    		httpWebRequest.BeginGetResponse(new AsyncCallback(FetchData), resultCallback);
    	}
    	
		void FetchData(IAsyncResult result)
        {
            HttpWebResponse response = (HttpWebResponse)httpWebRequest.EndGetResponse(result);
            XDocument xdoc = XDocument.Load(response.GetResponseStream());

            var fetchResult = 
				(from _contact in xdoc.Descendants("contact")
				select new Contact()
				{
					Name = _contact.ElementAnyNS("name") != null ? _contact.ElementAnyNS("name").Value : "",
					Role = _contact.ElementAnyNS("role") != null ? _contact.ElementAnyNS("role").Value : "",
					Bio = _contact.ElementAnyNS("bio") != null ? _contact.ElementAnyNS("bio").Value : "",
					Pictureurl = _contact.ElementAnyNS("pictureurl") != null ? _contact.ElementAnyNS("pictureurl").Value : "",
					Mail = _contact.ElementAnyNS("mail") != null ? _contact.ElementAnyNS("mail").Value : "",
					Phone = _contact.ElementAnyNS("phone") != null ? _contact.ElementAnyNS("phone").Value : "",
					Webaddresses = 
							(from _webaddresses in xdoc.Descendants("webaddresses")
							select new WebAddress()
							{
								Title = _webaddresses.ElementAnyNS("title") != null ? _webaddresses.ElementAnyNS("title").Value : "",
								Url = _webaddresses.ElementAnyNS("url") != null ? _webaddresses.ElementAnyNS("url").Value : ""
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
