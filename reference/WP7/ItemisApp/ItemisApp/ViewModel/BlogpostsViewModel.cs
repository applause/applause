using System;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Windows;
using System.Xml.Linq;
using ItemisApp.Model;
using GalaSoft.MvvmLight;
using System.Collections.Generic;

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
    public class BlogpostsViewModel : ViewModelBase
    {
        /// <summary>
        /// Initializes a new instance of the BlogpostsViewModel class.
        /// </summary>
        public BlogpostsViewModel()
        {
            if (IsInDesignMode)
            {
                for (int i = 0; i < 10; i++)
                {
                    _blogposts.Add(new BlogItem()
                    {
                        Title = "Designtime title",
                        Creator = "Peter Friese"
                    });                    
                }
            }
            else
            {
                // Code runs "for real": Connect to service, etc...
                LoadData("http://feeds.feedburner.com/FormFollowsFunction");
                //LoadData("http://feedsanitizer.appspot.com/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss");
            }
        }

        private HttpWebRequest httpWebRequest;

        private void LoadData(string url)
        {
            httpWebRequest = HttpWebRequest.CreateHttp(url);
            httpWebRequest.BeginGetResponse(new AsyncCallback(GetBlogposts), null);
        }

        void GetBlogposts(IAsyncResult result)
        {
            HttpWebResponse response = (HttpWebResponse)httpWebRequest.EndGetResponse(result);
            XDocument xdoc = XDocument.Load(response.GetResponseStream());

            var items = (from item in xdoc.Descendants("item")
                         select new BlogItem()
                         {
                             Guid = item.ElementAnyNS("guid").Value,
                             Title = item.ElementAnyNS("title").Value,
                             Link = item.ElementAnyNS("link").Value,
                             Description = item.ElementAnyNS("description").Value,
                             PubDate = item.ElementAnyNS("pubDate").Value,
                             Creator = item.ElementAnyNS("creator").Value
                         });
            Deployment.Current.Dispatcher.BeginInvoke(() =>
            {
                foreach (var item in items)
                {
                    _blogposts.Add(item);
                }
            });

        }


        ////public override void Cleanup()
        ////{
        ////    // Clean own resources if needed

        ////    base.Cleanup();
        ////}

        /// <summary>
        /// The <see cref="Blogposts" /> property's name.
        /// </summary>
        public const string BlogpostsPropertyName = "Blogposts";

        private ObservableCollection<BlogItem> _blogposts = new ObservableCollection<BlogItem>();

        /// <summary>
        /// Gets the Blogposts property.
        /// TODO Update documentation:
        /// Changes to that property's value raise the PropertyChanged event. 
        /// This property's value is broadcasted by the Messenger's default instance when it changes.
        /// </summary>
        public ObservableCollection<BlogItem> Blogposts
        {
            get
            {
                return _blogposts;
            }

            set
            {
                if (_blogposts == value)
                {
                    return;
                }

                var oldValue = _blogposts;
                _blogposts = value;

                // Update bindings, no broadcast
                RaisePropertyChanged(BlogpostsPropertyName);
            }
        }
    }
}