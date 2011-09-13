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
    public class BlogListViewModel : ViewModelBase
    {
    	BlogpostsContentProvider _provider;
    	
		public BlogListViewModel(BlogpostsContentProvider provider)
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
            if (result is List<BlogItem>) 
            {
                BlogItem = (List<BlogItem>)result;
                MapSections(result);
                
            }
        }
        
        private void MapSections(object result)
        {
			var grouped = new List<IEnumerable>();
			grouped.Add(new GroupingLayer<string, BlogItem>("", BlogItem));
			Sections = grouped;        
        }
        
		#endregion
		
		#region BlogItem Property
		public const string BlogItemPropertyName = "BlogItem";
		private List<BlogItem> _blogItem = null;
		public List<BlogItem> BlogItem
		{
			get 
			{ 
				return _blogItem;
			}
			
			set
			{
				if (_blogItem == value)
				{
					return;
				}
				_blogItem = value;
				RaisePropertyChanged(BlogItemPropertyName);
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
					
						if (selection is BlogItem)
						{
							NavigationMessage msg = new NavigationMessage()
							{
								PageName = "BlogDetailsPage",
								ViewModelName = "BlogDetailsViewModel"
							};
							msg.Payload.Add("blogItem", (BlogItem)selection);
							Messenger.Default.Send<NavigationMessage>(msg);
						}

                	}
				);
            }
        }
		#endregion
    }
}
