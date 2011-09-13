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
    public class EventListViewModel : ViewModelBase
    {
    	CurrentTimelineContentProvider _provider;
    	
		public EventListViewModel(CurrentTimelineContentProvider provider)
		{
			
			_provider = provider;
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
    		_provider.LoadData(AcceptData);
    	
		}

        public void AcceptData(object result) 
        {
            if (result is AllEvents) 
            {
                AllEvents = (AllEvents)result;
                MapSections(result);
                
            }
        }
        
        private void MapSections(object result)
        {
			var grouped = new List<IEnumerable>();
			grouped.Add(new GroupingLayer<string, Event>("News", AllEvents.News));
			grouped.Add(new GroupingLayer<string, Event>("Events", AllEvents.Activity));
			grouped.Add(new GroupingLayer<string, Event>("Workshops", AllEvents.Workshop));
			Sections = grouped;        
        }
        
		#endregion
		
		#region AllEvents Property
		public const string AllEventsPropertyName = "AllEvents";
		private AllEvents _allEvents = null;
		public AllEvents AllEvents
		{
			get 
			{ 
				return _allEvents;
			}
			
			set
			{
				if (_allEvents == value)
				{
					return;
				}
				_allEvents = value;
				RaisePropertyChanged(AllEventsPropertyName);
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
					
						if (selection is Event)
						{
							NavigationMessage msg = new NavigationMessage()
							{
								PageName = "EventDetailsPage",
								ViewModelName = "EventDetailsViewModel"
							};
							msg.Payload.Add("event", (Event)selection);
							Messenger.Default.Send<NavigationMessage>(msg);
						}

                	}
				);
            }
        }
		#endregion
    }
}
