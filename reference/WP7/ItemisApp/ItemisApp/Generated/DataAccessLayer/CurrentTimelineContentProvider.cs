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
        private static string DATA_URL = "http://www.itemis.de/language=de/~xml.timeline/37606";

        private HttpWebRequest httpWebRequest;

        public void LoadData(ContentProviderResultCallback resultCallback)
        {
            httpWebRequest = HttpWebRequest.CreateHttp(DATA_URL);
            httpWebRequest.BeginGetResponse(new AsyncCallback(FetchData), resultCallback);
        }

        void FetchData(IAsyncResult result)
        {
            HttpWebResponse response = (HttpWebResponse)httpWebRequest.EndGetResponse(result);
            XDocument xdoc = XDocument.Load(response.GetResponseStream());

            var fetchResult = (from item in xdoc.Descendants("events")
                               select new AllEvents()
                               {
                                   News = (from news in item.Descendants("news")
                                           select new Event()
                                           {
                                               Id = news.Element("id").Value,
                                               Kind = news.ElementAnyNS("kind").Value,
                                               Title = news.ElementAnyNS("title").Value,
                                               Date = news.ElementAnyNS("date").Value,
                                               Location = news.ElementAnyNS("location").Value,
                                               Description = news.ElementAnyNS("description").Value,
                                               Contact = news.ElementAnyNS("contact").Value,
                                               Link = news.ElementAnyNS("url").Value
                                           }).ToList(),
                                   Activity = (from activity in item.Descendants("activity")
                                               select new Event()
                                               {
                                                   Id = activity.Element("id").Value,
                                                   Kind = activity.ElementAnyNS("kind").Value,
                                                   Title = activity.ElementAnyNS("title").Value,
                                                   Date = activity.ElementAnyNS("date").Value,
                                                   Location = activity.ElementAnyNS("location").Value,
                                                   Description = activity.ElementAnyNS("description").Value,
                                                   Contact = activity.ElementAnyNS("contact").Value,
                                                   Link = activity.ElementAnyNS("url").Value
                                               }).ToList(),
                                   Workshop = (from workshop in item.Descendants("workshop")
                                               select new Event()
                                               {
                                                   Id = workshop.Element("id").Value,
                                                   Kind = workshop.ElementAnyNS("kind").Value,
                                                   Title = workshop.ElementAnyNS("title").Value,
                                                   Date = workshop.ElementAnyNS("date").Value,
                                                   Location = workshop.ElementAnyNS("location").Value,
                                                   Description = workshop.ElementAnyNS("description").Value,
                                                   Contact = workshop.ElementAnyNS("contact").Value,
                                                   Link = workshop.ElementAnyNS("url").Value,
                                                   Speakers = (from speakers in workshop.Descendants("speakers")
                                                               select new Contact()
                                                               {
                                                                   Name = speakers.Element("name").Value,
                                                                   Role = speakers.Element("role").Value
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
