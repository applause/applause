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
	public class BlogItem : INotifyPropertyChanged
	{
		
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

		private String _link;

		public String Link
		{
			get { return _link; }
			set
			{
				if (value != _link)
				{
					_link = value;
					NotifyPropertyChanged("Link");
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

		private String _creator;

		public String Creator
		{
			get { return _creator; }
			set
			{
				if (value != _creator)
				{
					_creator = value;
					NotifyPropertyChanged("Creator");
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
