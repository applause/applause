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
    public class JobOfferDetailsViewModel : ViewModelBase
    {
    	
		public JobOfferDetailsViewModel()
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
            if (result is JobOffer) 
            {
                JobOffer = (JobOffer)result;
                MapSections(result);
                
            }
        }
        
        private void MapSections(object result)
        {
			var grouped = new List<IEnumerable>();
			Sections = grouped;        
        }
        
		#endregion
		
		#region JobOffer Property
		public const string JobOfferPropertyName = "JobOffer";
		private JobOffer _jobOffer = null;
		public JobOffer JobOffer
		{
			get 
			{ 
				return _jobOffer;
			}
			
			set
			{
				if (_jobOffer == value)
				{
					return;
				}
				_jobOffer = value;
				RaisePropertyChanged(JobOfferPropertyName);
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
