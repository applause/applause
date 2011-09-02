using System;
using System.Linq;
using System.Net;
using System.Windows;
using System.Xml.Linq;
using GalaSoft.MvvmLight;
using ItemisApp.Model;

namespace ItemisApp.ViewModel
{
    /// <summary>
    /// This class contains properties that a View can data bind to.
    /// <para>
    /// Use the <strong>mvvminpc</strong> snippet to add bindable properties to this ViewModel.
    /// </para>
    /// <para>
    /// You can also use Blend to data bind with the tool's support.
    /// </para>
    /// <para>
    /// See http://www.galasoft.ch/mvvm/getstarted
    /// </para>
    /// </summary>
    public class AllEventsViewModel : ViewModelBase
    {
        /// <summary>
        /// Initializes a new instance of the AllEventsViewModel class.
        /// </summary>
        public AllEventsViewModel()
        {
            if (IsInDesignMode)
            {
                // Code runs in Blend --> create design time data.
            }
            else
            {
                // Code runs "for real": Connect to service, etc...
                LoadData("http://www.itemis.de/language=de/~xml.timeline/37606");
            }
        }

        ////public override void Cleanup()
        ////{
        ////    // Clean own resources if needed

        ////    base.Cleanup();
        ////}

        private HttpWebRequest httpWebRequest;

        private void LoadData(string url)
        {
            httpWebRequest = HttpWebRequest.CreateHttp(url);
            httpWebRequest.BeginGetResponse(new AsyncCallback(FetchData), null);
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
                                                   Link = workshop.ElementAnyNS("url").Value
                                               }).ToList()
                               });
            Deployment.Current.Dispatcher.BeginInvoke(() =>
            {
                AllEvents = fetchResult.First();
            });

        }

        /// <summary>
        /// The <see cref="AllEvents" /> property's name.
        /// </summary>
        public const string AllEventsPropertyName = "AllEvents";

        private AllEvents _allEvents = null;

        /// <summary>
        /// Gets the AllEvents property.
        /// TODO Update documentation:
        /// Changes to that property's value raise the PropertyChanged event. 
        /// This property's value is broadcasted by the Messenger's default instance when it changes.
        /// </summary>
        public AllEvents AllEvents
        {
            get
            {
                return _allEvents;
            }

            set
            {
                if (_allEvents == value)
                {
                    return;
                }

                var oldValue = _allEvents;
                _allEvents = value;

                // Update bindings, no broadcast
                RaisePropertyChanged(AllEventsPropertyName);
            }
        }

    }
}