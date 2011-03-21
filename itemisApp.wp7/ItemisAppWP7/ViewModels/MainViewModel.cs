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


namespace ItemisAppWP7
{
    public class MainViewModel : INotifyPropertyChanged
    {
        public MainViewModel()
        {
            this.Items = new ObservableCollection<ItemViewModel>();
            this.BlogItems = new ObservableCollection<BlogItemViewModel>();
        }

        /// <summary>
        /// A collection for ItemViewModel objects.
        /// </summary>
        public ObservableCollection<ItemViewModel> Items { get; private set; }
        public ObservableCollection<BlogItemViewModel> BlogItems { get; private set; }

        public bool IsDataLoaded
        {
            get;
            private set;
        }

        public void LoadData()
        {
            // TODO: 
            // entity -> ViewModel
            // contentprovider -> ViewModelProvider (load / update collections of data / parse data)
            // hook ViewModelProvider into MainVievModel
            // each view can access one ViewModelProvider
            WebClient client = new WebClient();
            client.DownloadStringAsync(new Uri("http://192.168.210.1:3000/itemisblog-sanitized.rss"));
            //client.DownloadStringAsync(new Uri("http://feedsanitizer.appspot.com/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss"));
            client.DownloadStringCompleted += new DownloadStringCompletedEventHandler(client_DownloadStringCompleted);

            // Sample data; replace with real data
            this.Items.Add(new ItemViewModel() { LineOne = "runtime one", LineTwo = "Maecenas praesent accumsan bibendum", LineThree = "Facilisi faucibus habitant inceptos interdum lobortis nascetur pharetra placerat pulvinar sagittis senectus sociosqu" });
            this.Items.Add(new ItemViewModel() { LineOne = "runtime two", LineTwo = "Dictumst eleifend facilisi faucibus", LineThree = "Suscipit torquent ultrices vehicula volutpat maecenas praesent accumsan bibendum dictumst eleifend facilisi faucibus" });
            this.IsDataLoaded = true;
        }

        void client_DownloadStringCompleted(object sender, DownloadStringCompletedEventArgs e)
        {
            if (e.Error == null)
            {
                ParseBlogItemsFromXml(e.Result);
            }
        }

        void ParseBlogItemsFromXml(String source)
        {
            this.BlogItems.Clear();

            XDocument xdoc = XDocument.Parse(source);
            XNamespace dc ="http://purl.org/dc/elements/1.1/";
            List<BlogItemViewModel> result = 
                (
                    from item in xdoc.Descendants("item")
                    select new BlogItemViewModel
                    {
                        Title = item.Element("title").Value,
                        Link = item.Element("link").Value,
                        Creator = item.Element(dc + "creator").Value,
                        Description = item.Element("description").Value,
                    }
                ).ToList<BlogItemViewModel>();
            result.ForEach(this.BlogItems.Add);
        }

        public event PropertyChangedEventHandler PropertyChanged;
        private void NotifyPropertyChanged(String propertyName)
        {
            PropertyChangedEventHandler handler = PropertyChanged;
            if (null != handler)
            {
                handler(this, new PropertyChangedEventArgs(propertyName));
            }
        }
    }
}