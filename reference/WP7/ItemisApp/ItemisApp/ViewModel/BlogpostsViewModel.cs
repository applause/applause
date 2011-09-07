using System;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Windows;
using System.Xml.Linq;
using GalaSoft.MvvmLight;
using ItemisApp.Model;

namespace ItemisApp.ViewModel
{
    public class BlogpostsViewModel : ViewModelBase
    {
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
                LoadData("http://feeds.feedburner.com/FormFollowsFunction");
                //LoadData("http://feedsanitizer.appspot.com/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss");
            }
        }

        #region Data Access

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
        #endregion

        #region Blogposts Property

        public const string BlogpostsPropertyName = "Blogposts";

        private ObservableCollection<BlogItem> _blogposts = new ObservableCollection<BlogItem>();

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

                RaisePropertyChanged(BlogpostsPropertyName);
            }
        }
        #endregion
    }
}