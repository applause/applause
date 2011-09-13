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
    public class OfficeListViewModel : ViewModelBase
    {
    	CompanyDescriptionContentProvider _provider;
    	
		public OfficeListViewModel(CompanyDescriptionContentProvider provider)
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
            if (result is Company) 
            {
                Company = (Company)result;
                MapSections(result);
                
            }
        }
        
        private void MapSections(object result)
        {
			var grouped = new List<IEnumerable>();
			grouped.Add(new GroupingLayer<string, Office>("Offices", Company.Office));
			Sections = grouped;        
        }
        
		#endregion
		
		#region Company Property
		public const string CompanyPropertyName = "Company";
		private Company _company = null;
		public Company Company
		{
			get 
			{ 
				return _company;
			}
			
			set
			{
				if (_company == value)
				{
					return;
				}
				_company = value;
				RaisePropertyChanged(CompanyPropertyName);
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
					
						if (selection is Office)
						{
							NavigationMessage msg = new NavigationMessage()
							{
								PageName = "OfficeDetailsPage",
								ViewModelName = "OfficeDetailsViewModel"
							};
							msg.Payload.Add("office", (Office)selection);
							Messenger.Default.Send<NavigationMessage>(msg);
						}

                	}
				);
            }
        }
		#endregion
    }
}
