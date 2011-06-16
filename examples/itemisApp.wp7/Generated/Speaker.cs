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
using System.Collections.Generic;

namespace ItemisApp
{
	public class Speaker : INotifyPropertyChanged
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

		private String _name;

		public String Name
		{
			get { return _name; }
			set
			{
				if (value != _name)
				{
					_name = value;
					NotifyPropertyChanged("Name");
				}
			}
		}

		private String _bio;

		public String Bio
		{
			get { return _bio; }
			set
			{
				if (value != _bio)
				{
					_bio = value;
					NotifyPropertyChanged("Bio");
				}
			}
		}

		private String _pictureurl;

		public String Pictureurl
		{
			get { return _pictureurl; }
			set
			{
				if (value != _pictureurl)
				{
					_pictureurl = value;
					NotifyPropertyChanged("Pictureurl");
				}
			}
		}

		private List<Session> _sessions;

		public List<Session> Sessions
		{
			get { return _sessions; }
			set
			{
				if (value != _sessions)
				{
					_sessions = value;
					NotifyPropertyChanged("Sessions");
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
