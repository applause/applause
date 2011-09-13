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
    public class CompanyDescriptionContentProvider
    {
    	private HttpWebRequest httpWebRequest;
    	
    	public void LoadData(ContentProviderResultCallback resultCallback)
    	{
    		httpWebRequest = HttpWebRequest.CreateHttp("http://www.itemis.de/language=de/~xml.company/37606");
    		httpWebRequest.BeginGetResponse(new AsyncCallback(FetchData), resultCallback);
    	}
    	
		void FetchData(IAsyncResult result)
        {
            HttpWebResponse response = (HttpWebResponse)httpWebRequest.EndGetResponse(result);
            XDocument xdoc = XDocument.Load(response.GetResponseStream());

            var fetchResult = 
				(from _company in xdoc.Descendants("company")
				select new Company()
				{
					Description = _company.ElementAnyNS("description") != null ? _company.ElementAnyNS("description").Value : "",
					Office = 
							(from _office in xdoc.Descendants("office")
							select new Office()
							{
								Id = _office.ElementAnyNS("id") != null ? _office.ElementAnyNS("id").Value : "",
								Location = _office.ElementAnyNS("location") != null ? _office.ElementAnyNS("location").Value : "",
								Summary = _office.ElementAnyNS("summary") != null ? _office.ElementAnyNS("summary").Value : "",
								Pictureurl = _office.ElementAnyNS("pictureurl") != null ? _office.ElementAnyNS("pictureurl").Value : "",
								Contact = 
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
										}).First(),
								Phone = _office.ElementAnyNS("phone") != null ? _office.ElementAnyNS("phone").Value : "",
								Mail = _office.ElementAnyNS("mail") != null ? _office.ElementAnyNS("mail").Value : "",
								Address = _office.ElementAnyNS("address") != null ? _office.ElementAnyNS("address").Value : "",
								Geo = _office.ElementAnyNS("geo") != null ? _office.ElementAnyNS("geo").Value : ""
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
