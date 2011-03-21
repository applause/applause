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
	public class BlogItemByIdModelProvider
	{
		
		private BlogItem b;

		public BlogItemByIdModelProvider(BlogItem b)
		{
			this.b = b;
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
			client.DownloadStringAsync(new Uri("dfsdfsdfsdfs" + b.Link));
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
					from blogItem in xdoc.Descendants("session")
					select new BlogItem
					{
						Title = BlogItem.Element("title").Value,
						Link = BlogItem.Element("link").Value,
						Description = BlogItem.Element("description").Value,
						Creator = BlogItem.Element(dc + "creator").Value,
					}
				).ToList<BlogItem>();
			result.ForEach(this.BlogItems.Add);
		}
	}
}
