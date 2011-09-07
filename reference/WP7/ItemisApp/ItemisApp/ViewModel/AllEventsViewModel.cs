using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Xml.Linq;
using GalaSoft.MvvmLight;
using GalaSoft.MvvmLight.Command;
using GalaSoft.MvvmLight.Messaging;
using ItemisApp.Model;
using ItemisApp.Views;

namespace ItemisApp.ViewModel
{
    public class AllEventsViewModel : ViewModelBase
    {

        public AllEventsViewModel()
        {
            if (IsInDesignMode)
            {
            }
            else
            {
                LoadData("http://www.itemis.de/language=de/~xml.timeline/37606");
            }
        }

        #region Data Source

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
                AllEvents = fetchResult.First();
                var grouped = new List<IEnumerable>();
                grouped.Add(new GroupingLayer<string, Event>("News", AllEvents.News));
                grouped.Add(new GroupingLayer<string, Event>("Events", AllEvents.Activity));
                grouped.Add(new GroupingLayer<string, Event>("Workshops", AllEvents.Workshop));
                AllEventsGrouped = grouped;
            });

        }
        #endregion

        #region AllEvents Property

        public const string AllEventsPropertyName = "AllEvents";
        private AllEvents _allEvents = null;
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

                RaisePropertyChanged(AllEventsPropertyName);
            }
        }
        #endregion


        #region Sections Property

        public const string AllEventsGroupedProperyName = "AllEventsGrouped";
        List<IEnumerable> _grouped = null;

        public List<IEnumerable> AllEventsGrouped
        {
            get
            {
                return _grouped;
            }
            set
            {
                if (_grouped == value)
                {
                    return;
                }

                var oldValue = _grouped;
                _grouped = value;

                RaisePropertyChanged(AllEventsGroupedProperyName);
            }
        }
        #endregion


        #region Selected Event Property

        public const string SelectedEventPropertyName = "SelectedEvent";
        private Event _selectedEvent = null;

        public Event SelectedEvent
        {
            get
            {
                return _selectedEvent;
            }

            set
            {
                if (_selectedEvent == value)
                {
                    return;
                }

                var oldValue = _selectedEvent;
                _selectedEvent = value;

                RaisePropertyChanged(SelectedEventPropertyName, oldValue, value, true);
            }
        }
        #endregion


        #region Goto Event Details Page Property

        private RelayCommand<Event> _gotoEventDetailsCommand;

        public RelayCommand<Event> GotoEventDetailsCommand
        {
            get
            {
                return _gotoEventDetailsCommand ?? (_gotoEventDetailsCommand = new RelayCommand<Event>(
                    (theEvent) =>
                    {
                        var msg = new GotoPageWithEventMessage() { PageName = "EventDetailsPage" + ".xaml", Event = theEvent };
                        Messenger.Default.Send<GotoPageWithEventMessage>(msg);
                    }));
            }
        }
        #endregion

    }
}