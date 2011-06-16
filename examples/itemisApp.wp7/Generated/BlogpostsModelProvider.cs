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
	public class BlogpostsModelProvider
	{
		
		public BlogpostsModelProvider()
		{
			this.BlogItems = new ObservableCollection<BlogItem>();
		}
				
		
		public ObservableCollection<BlogItem> BlogItems { get; private set; }
		
		public bool IsDataLoaded
		{
			get;
			private set;
		}
		
		public void LoadData()
		{
			WebClient client = new WebClient();
			client.DownloadStringAsync(new Uri("http://feedsanitizer.appspot.com" + "/sanitize?url=http%3A%2F%2Fblogs.itemis.de%2F%3Fshowfeed%3D1&format=rss"));
			client.DownloadStringCompleted += new DownloadStringCompletedEventHandler(client_DownloadStringCompleted);			
		}
		
		void client_DownloadStringCompleted(object sender, DownloadStringCompletedEventArgs e)
		{
			if (e.Error == null)
			{
				ParseDataFromXml(e.Result);
				this.IsDataLoaded = true;
			}
		}
		
		void ParseDataFromXml(String source)
		{
			this.BlogItems.Clear();

			XDocument xdoc = XDocument.Parse(source);
			XNamespace dc ="http://purl.org/dc/elements/1.1/";
			List<BlogItem> result =
				(
					from blogItem in xdoc.Descendants("item")
					select new BlogItem
					{
						Guid = (blogItem.Element("guid") != null) ? blogItem.Element("guid").Value : "",
						Title = (blogItem.Element("title") != null) ? blogItem.Element("title").Value : "",
						Link = (blogItem.Element("link") != null) ? blogItem.Element("link").Value : "",
						Description = (blogItem.Element("description") != null) ? blogItem.Element("description").Value : "",
						Creator = (blogItem.Element(dc + "creator") != null) ? blogItem.Element(dc + "creator").Value : "",
					}
				).ToList<BlogItem>();
			result.ForEach(this.BlogItems.Add);
		}
	}
}
