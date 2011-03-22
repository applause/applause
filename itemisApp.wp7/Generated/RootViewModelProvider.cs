using System;
using System.ComponentModel;
using System.Collections.Generic;
using System.Diagnostics;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using System.Collections.ObjectModel;
using System.Net;
using System.Linq;
using System.Xml.Linq;

namespace ItemisApp
{
    public class RootViewModelProvider
    {
        public RootViewModelProvider()
        {
        }
        
        private BlogpostsModelProvider _blogpostsModelProvider;		
        public BlogpostsModelProvider BlogpostsModelProvider() {		                

            if (_blogpostsModelProvider == null)
            {
                _blogpostsModelProvider = new BlogpostsModelProvider();
                _blogpostsModelProvider.LoadData();
            }
            return _blogpostsModelProvider;
        }
        private Dictionary<String, SessionsByDayModelProvider> _sessionsByDayModelProvider = new Dictionary<String, SessionsByDayModelProvider>();
        public SessionsByDayModelProvider SessionsByDayModelProvider(String day) {
            SessionsByDayModelProvider provider = null;
            if (!_sessionsByDayModelProvider.ContainsKey(day))
            {
                provider = new SessionsByDayModelProvider(day);
                provider.LoadData();
                _sessionsByDayModelProvider.Add(day, provider);
            }
            else
            {
                provider = _sessionsByDayModelProvider[day];
            }
            return provider;
        }
        private Dictionary<Session, SessionByIdModelProvider> _sessionByIdModelProvider = new Dictionary<Session, SessionByIdModelProvider>();
        public SessionByIdModelProvider SessionByIdModelProvider(Session s) {
            SessionByIdModelProvider provider = null;
            if (!_sessionByIdModelProvider.ContainsKey(s))
            {
                provider = new SessionByIdModelProvider(s);
                provider.LoadData();
                _sessionByIdModelProvider.Add(s, provider);
            }
            else
            {
                provider = _sessionByIdModelProvider[s];
            }
            return provider;
        }
        private Dictionary<Speaker, SpeakerByIdModelProvider> _speakerByIdModelProvider = new Dictionary<Speaker, SpeakerByIdModelProvider>();
        public SpeakerByIdModelProvider SpeakerByIdModelProvider(Speaker s) {
            SpeakerByIdModelProvider provider = null;
            if (!_speakerByIdModelProvider.ContainsKey(s))
            {
                provider = new SpeakerByIdModelProvider(s);
                provider.LoadData();
                _speakerByIdModelProvider.Add(s, provider);
            }
            else
            {
                provider = _speakerByIdModelProvider[s];
            }
            return provider;
        }
        private Dictionary<BlogItem, BlogItemByIdModelProvider> _blogItemByIdModelProvider = new Dictionary<BlogItem, BlogItemByIdModelProvider>();
        public BlogItemByIdModelProvider BlogItemByIdModelProvider(BlogItem b) {
            BlogItemByIdModelProvider provider = null;
            if (!_blogItemByIdModelProvider.ContainsKey(b))
            {
                provider = new BlogItemByIdModelProvider(b);
                provider.LoadData();
                _blogItemByIdModelProvider.Add(b, provider);
            }
            else
            {
                provider = _blogItemByIdModelProvider[b];
            }
            return provider;
        }
        private AllSpeakersModelProvider _allSpeakersModelProvider;		
        public AllSpeakersModelProvider AllSpeakersModelProvider() {		                

            if (_allSpeakersModelProvider == null)
            {
                _allSpeakersModelProvider = new AllSpeakersModelProvider();
                _allSpeakersModelProvider.LoadData();
            }
            return _allSpeakersModelProvider;
        }
        private Dictionary<String, SpeakerByNameModelProvider> _speakerByNameModelProvider = new Dictionary<String, SpeakerByNameModelProvider>();
        public SpeakerByNameModelProvider SpeakerByNameModelProvider(String name) {
            SpeakerByNameModelProvider provider = null;
            if (!_speakerByNameModelProvider.ContainsKey(name))
            {
                provider = new SpeakerByNameModelProvider(name);
                provider.LoadData();
                _speakerByNameModelProvider.Add(name, provider);
            }
            else
            {
                provider = _speakerByNameModelProvider[name];
            }
            return provider;
        }

        public bool IsDataLoaded
        {
            get;
            private set;
        }

        public void LoadData()
        {
            IsDataLoaded = false;
            IsDataLoaded = true;
        }

    }
}
