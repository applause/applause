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
	public class AllSpeakersModelProvider
	{
		
		public AllSpeakersModelProvider()
		{
			this.Speakers = new ObservableCollection<Speaker>();
		}
				
		
		public ObservableCollection<Speaker> Speakers { get; private set; }
		
		public bool IsDataLoaded
		{
			get;
			private set;
		}
		
		public void LoadData()
		{
			WebClient client = new WebClient();
			client.DownloadStringAsync(new Uri("http://eclipsecon2011-data.webbyapp.com" + "/speakers.xml"));
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
			this.Speakers.Clear();

			XDocument xdoc = XDocument.Parse(source);
			XNamespace dc ="http://purl.org/dc/elements/1.1/";
			List<Speaker> result =
				(
					from speaker in xdoc.Descendants("speaker")
					select new Speaker
					{
						Id = (speaker.Element("id") != null) ? speaker.Element("id").Value : "",
						Name = (speaker.Element("name") != null) ? speaker.Element("name").Value : "",
						Bio = (speaker.Element("bio") != null) ? speaker.Element("bio").Value : "",
						Pictureurl = (speaker.Element("pictureurl") != null) ? speaker.Element("pictureurl").Value : "",
						Sessions = 
							(
								from session in xdoc.Descendants("sessions")
								select new Session
								{
									Id = (session.Element("id") != null) ? session.Element("id").Value : "",
									Title = (session.Element("title") != null) ? session.Element("title").Value : "",
									Description = (session.Element("description") != null) ? session.Element("description").Value : "",
									Date = (session.Element("date") != null) ? session.Element("date").Value : "",
									Timeslot = (session.Element("timeslot") != null) ? session.Element("timeslot").Value : "",
									Room = (session.Element("room") != null) ? session.Element("room").Value : "",
								}
							).ToList<Session>(),

					}
				).ToList<Speaker>();
			result.ForEach(this.Speakers.Add);
		}
	}
}
