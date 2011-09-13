using System.Collections;
using System.Collections.Generic;
using Applause.ViewModel;
using GalaSoft.MvvmLight;
using GalaSoft.MvvmLight.Command;
using GalaSoft.MvvmLight.Messaging;
using Microsoft.Phone.Tasks;
using ItemisApp.DataAccessLayer;
using ItemisApp.Model;
using ItemisApp.Views;

namespace ItemisApp.ViewModel
{
    public class EventDetailsViewModel : ViewModelBase
    {
    	
		public EventDetailsViewModel()
		{
			if (IsInDesignMode)
			{
			}
			else {
				LoadData();
			}
		}
		
		#region Data Source
		private void LoadData()
		{
    	
		}

        public void AcceptData(object result) 
        {
            if (result is Event) 
            {
                Event = (Event)result;
                MapSections(result);
                
            }
        }
        
        private void MapSections(object result)
        {
			var grouped = new List<IEnumerable>();
			grouped.Add(new GroupingLayer<string, Contact>("", Event.Speakers));
			Sections = grouped;        
        }
        
		#endregion
		
		#region Event Property
		public const string EventPropertyName = "Event";
		private Event _event = null;
		public Event Event
		{
			get 
			{ 
				return _event;
			}
			
			set
			{
				if (_event == value)
				{
					return;
				}
				_event = value;
				RaisePropertyChanged(EventPropertyName);
			}
		}
		#endregion
		
		#region Sections Property
        public const string SectionsProperyName = "Sections";
        List<IEnumerable> _sections = null;

        public List<IEnumerable> Sections
        {
            get
            {
                return _sections;
            }
            set
            {
                if (_sections == value)
                {
                    return;
                }

                var oldValue = _sections;
                _sections = value;

                RaisePropertyChanged(SectionsProperyName);
            }
        }
		#endregion
		
		#region Navigation
        public RelayCommand<object> NavigationCommand
        {
            get
            {
                return new RelayCommand<object>(
                	(selection) =>
                	{
					
						if (selection is Contact)
						{
							NavigationMessage msg = new NavigationMessage()
							{
								PageName = "PersonDetailsPage",
								ViewModelName = "PersonDetailsViewModel"
							};
							msg.Payload.Add("contact", (Contact)selection);
							Messenger.Default.Send<NavigationMessage>(msg);
						}

                	}
				);
            }
        }
		#endregion
    }
}
