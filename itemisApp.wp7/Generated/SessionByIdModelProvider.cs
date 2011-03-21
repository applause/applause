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
	public class SessionByIdModelProvider
	{
		
		private Session s;

		public SessionByIdModelProvider(Session s)
		{
			this.s = s;
			this.Sessions = new ObservableCollection<Session>();
		}
				
		
		public ObservableCollection<Session> Sessions { get; private set; }
		
		public bool IsDataLoaded
		{
			get;
			private set;
		}
		
		public void LoadData()
		{
			WebClient client = new WebClient();
			client.DownloadStringAsync(new Uri("http://192.168.210.1:3000" + "/sessions/id/" + s.Id + ".xml"));
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
			this.Sessions.Clear();

			XDocument xdoc = XDocument.Parse(source);
			XNamespace dc ="http://purl.org/dc/elements/1.1/";
			List<Session> result =
				(
					from session in xdoc.Descendants("session")
					select new Session
					{
						Id = Session.Element("id").Value,
						Title = Session.Element("title").Value,
						Description = Session.Element("description").Value,
						Timeslot = Session.Element("timeslot").Value,
						Room = Session.Element("room").Value,
						Speakers = 
							(
								from speaker in xdoc.Descendants("speakers")
								select new Speaker
								{
									Id = Speaker.Element("id").Value,
									Name = Speaker.Element("name").Value,
									Bio = Speaker.Element("bio").Value,
									Pictureurl = Speaker.Element("pictureurl").Value,
								}
							).ToList<Speaker>();

					}
				).ToList<Session>();
			result.ForEach(this.Sessions.Add);
		}
	}
}
