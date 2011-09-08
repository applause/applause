using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Xml.Linq;
using ItemisApp.Model;
using ItemisApp.DataAccessLayer;

namespace ItemisApp.DataAccessLayer
{
    public class PersonByNameContentProvider
    {
        private HttpWebRequest httpWebRequest;

        private string BuildDataURL(string name)
        {
            return "http://www.itemis.de/applause/people/de/" + name.URLEncode() + ".xml";
        }

        // send url parameters as vararg parameter? might make it easier to generate the code!
        public void LoadData(string name, ContentProviderResultCallback resultCallback)
        {
            httpWebRequest = HttpWebRequest.CreateHttp(BuildDataURL(name));
            httpWebRequest.BeginGetResponse(new AsyncCallback(FetchData), resultCallback);
        }

        void FetchData(IAsyncResult result)
        {
            HttpWebResponse response = (HttpWebResponse)httpWebRequest.EndGetResponse(result);
            XDocument xdoc = XDocument.Load(response.GetResponseStream());

            var fetchResult = (from item in xdoc.Descendants("contact")
                               select new Contact()
                               {
                                   Name = item.ElementAnyNS("name").Value,
                                   Role = item.ElementAnyNS("role").Value,
                                   Bio = item.ElementAnyNS("bio").Value,
                                   Pictureurl = item.ElementAnyNS("pictureurl").Value,
                                   Mail = item.ElementAnyNS("mail").Value,
                                   Phone = item.ElementAnyNS("phone").Value                                   
                               });
            Deployment.Current.Dispatcher.BeginInvoke(() =>
            {
                ContentProviderResultCallback callback = (ContentProviderResultCallback) result.AsyncState;
                callback(fetchResult.First());
            });

        }
    }
}
