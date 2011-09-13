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
    public class CareerViewViewModel : ViewModelBase
    {
    	CareerDataContentProvider _provider;
    	
		public CareerViewViewModel(CareerDataContentProvider provider)
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
            if (result is Career) 
            {
                Career = (Career)result;
                MapSections(result);
                
            }
        }
        
        private void MapSections(object result)
        {
			var grouped = new List<IEnumerable>();
			grouped.Add(new GroupingLayer<string, Link>("Links", Career.Link));
			grouped.Add(new GroupingLayer<string, JobOffer>("Job Offers", Career.Job));
			Sections = grouped;        
        }
        
		#endregion
		
		#region Career Property
		public const string CareerPropertyName = "Career";
		private Career _career = null;
		public Career Career
		{
			get 
			{ 
				return _career;
			}
			
			set
			{
				if (_career == value)
				{
					return;
				}
				_career = value;
				RaisePropertyChanged(CareerPropertyName);
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
					
						if (selection is JobOffer)
						{
							NavigationMessage msg = new NavigationMessage()
							{
								PageName = "JobOfferDetailsPage",
								ViewModelName = "JobOfferDetailsViewModel"
							};
							msg.Payload.Add("jobOffer", (JobOffer)selection);
							Messenger.Default.Send<NavigationMessage>(msg);
						}

						if (selection is string)
						{
							string url = (string)selection;
                        	if (url.IndexOf("tel:") == 0)
                        	{
                            	PhoneCallTask task = new PhoneCallTask();
                            	task.PhoneNumber = url.Substring("tel:".Length);
                            	task.Show();
                        	}
                        	else if (url.IndexOf("mailto:") == 0)
                        	{
                            	EmailComposeTask task = new EmailComposeTask();
                            	task.To = url.Substring("mailto:".Length);
                            	task.Show();
                        	}
                        	else
                        	{
                        		// open browser
                        	}
						}
                	}
				);
            }
        }
		#endregion
    }
}
