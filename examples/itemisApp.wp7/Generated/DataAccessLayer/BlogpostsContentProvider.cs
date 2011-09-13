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
    public class BlogpostsContentProvider
    {
    	private HttpWebRequest httpWebRequest;
    	
    	public void LoadData(ContentProviderResultCallback resultCallback)
    	{
    		httpWebRequest = HttpWebRequest.CreateHttp("http://feedsanitizer.appspot.com" + "/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss");
    		httpWebRequest.BeginGetResponse(new AsyncCallback(FetchData), resultCallback);
    	}
    	
		void FetchData(IAsyncResult result)
        {
            HttpWebResponse response = (HttpWebResponse)httpWebRequest.EndGetResponse(result);
            XDocument xdoc = XDocument.Load(response.GetResponseStream());

            var fetchResult = 
				(from _blogItem in xdoc.Descendants("item")
				select new BlogItem()
				{
					Guid = _blogItem.ElementAnyNS("guid") != null ? _blogItem.ElementAnyNS("guid").Value : "",
					Title = _blogItem.ElementAnyNS("title") != null ? _blogItem.ElementAnyNS("title").Value : "",
					Link = _blogItem.ElementAnyNS("link") != null ? _blogItem.ElementAnyNS("link").Value : "",
					Description = _blogItem.ElementAnyNS("description") != null ? _blogItem.ElementAnyNS("description").Value : "",
					Creator = _blogItem.ElementAnyNS("creator") != null ? _blogItem.ElementAnyNS("creator").Value : ""
				}).ToList();			            				
            Deployment.Current.Dispatcher.BeginInvoke(() =>
            {
                ContentProviderResultCallback callback = (ContentProviderResultCallback) result.AsyncState;
                callback(fetchResult);
            });
        }
    	
    }
}
