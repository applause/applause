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
using ItemisApp.ViewModels;


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
        private SessionsByDayModelProvider _sessionsByDayModelProvider;
        public SessionsByDayModelProvider SessionsByDayModelProvider(String day) {
            if (_sessionsByDayModelProvider == null)
            {
                _sessionsByDayModelProvider = new SessionsByDayModelProvider(day);
                _sessionsByDayModelProvider.LoadData();
            }
            return _sessionsByDayModelProvider;
        }
        private SessionByIdModelProvider _sessionByIdModelProvider;
        public SessionByIdModelProvider SessionByIdModelProvider(Session s) {
            if (_sessionByIdModelProvider == null)
            {
                _sessionByIdModelProvider = new SessionByIdModelProvider(s);
                _sessionByIdModelProvider.LoadData();
            }
            return _sessionByIdModelProvider;
        }
        private SpeakerByIdModelProvider _speakerByIdModelProvider;
        public SpeakerByIdModelProvider SpeakerByIdModelProvider(Speaker s) {
            if (_speakerByIdModelProvider == null)
            {
                _speakerByIdModelProvider = new SpeakerByIdModelProvider(s);
                _speakerByIdModelProvider.LoadData();
            }
            return _speakerByIdModelProvider;
        }
        private BlogItemByIdModelProvider _blogItemByIdModelProvider;
        public BlogItemByIdModelProvider BlogItemByIdModelProvider(BlogItem b) {
            if (_blogItemByIdModelProvider == null)
            {
                _blogItemByIdModelProvider = new BlogItemByIdModelProvider(b);
                _blogItemByIdModelProvider.LoadData();
            }
            return _blogItemByIdModelProvider;
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
        private SpeakerByNameModelProvider _speakerByNameModelProvider;
        public SpeakerByNameModelProvider SpeakerByNameModelProvider(String name) {
            if (_speakerByNameModelProvider == null)
            {
                _speakerByNameModelProvider = new SpeakerByNameModelProvider(name);
                _speakerByNameModelProvider.LoadData();
            }
            return _speakerByNameModelProvider;
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
