using System;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;
using System.ComponentModel;

namespace ItemisApp
{
	public class Session : INotifyPropertyChanged
	{
		
		private String _id;

		public String Id
		{
			get { return _id; }
			set
			{
				if (value != _id)
				{
					_id = value;
					NotifyPropertyChanged("Id");
				}
			}
		}

		private String _title;

		public String Title
		{
			get { return _title; }
			set
			{
				if (value != _title)
				{
					_title = value;
					NotifyPropertyChanged("Title");
				}
			}
		}

		private String _description;

		public String Description
		{
			get { return _description; }
			set
			{
				if (value != _description)
				{
					_description = value;
					NotifyPropertyChanged("Description");
				}
			}
		}

		private String _timeslot;

		public String Timeslot
		{
			get { return _timeslot; }
			set
			{
				if (value != _timeslot)
				{
					_timeslot = value;
					NotifyPropertyChanged("Timeslot");
				}
			}
		}

		private String _room;

		public String Room
		{
			get { return _room; }
			set
			{
				if (value != _room)
				{
					_room = value;
					NotifyPropertyChanged("Room");
				}
			}
		}

		private Speaker _speakers;

		public Speaker Speakers
		{
			get { return _speakers; }
			set
			{
				if (value != _speakers)
				{
					_speakers = value;
					NotifyPropertyChanged("Speakers");
				}
			}
		}

		
		// PF: Note to self: this really should be in a runtime class
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
