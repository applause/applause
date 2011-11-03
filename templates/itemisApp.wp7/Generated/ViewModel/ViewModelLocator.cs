/*
  In App.xaml:
  <Application.Resources>
      <vm:ViewModelLocatorTemplate xmlns:vm="clr-namespace:ItemisApp"
                                   x:Key="Locator" />
  </Application.Resources>
  
  In the View:
  DataContext="{Binding Source={StaticResource Locator}, Path=ViewModelName}"

  You can also use Blend to do all this with the tool's support.
  See http://www.galasoft.ch/mvvm
*/

using GalaSoft.MvvmLight;

namespace ItemisApp.ViewModel
{
    /// <summary>
    /// This class contains static references to all the view models in the
    /// application and provides an entry point for the bindings.
    /// </summary>
public class ViewModelLocator
    {
        public ViewModelLocator()
        {
            if (ViewModelBase.IsInDesignModeStatic)
            {
                // Create design time view models
            }
            else
            {
                // Create run time view models
                CreateBlogpostsViewModel();
                CreateEventListViewModel();
                CreateEventDetailsViewModel();
                CreatePersonDetailsViewModel();
            }
        }

        public static void Cleanup()
        {
            ClearBlogpostsViewModel();
            ClearEventListViewModel();
            ClearEventDetailsViewModel();
            ClearPersonDetailsViewModel();
        }

        #region Blogposts Property

        private static BlogpostsViewModel _blogpostsViewModel;
        public static BlogpostsViewModel BlogpostsViewModelStatic
        {
            get
            {
                if (_blogpostsViewModel == null)
                {
                    CreateBlogpostsViewModel();
                }

                return _blogpostsViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public BlogpostsViewModel BlogpostsViewModel
        {
            get
            {
                return BlogpostsViewModelStatic;
            }
        }

        public static void ClearBlogpostsViewModel()
        {
            _blogpostsViewModel.Cleanup();
            _blogpostsViewModel = null;
        }

        public static void CreateBlogpostsViewModel()
        {
            if (_blogpostsViewModel == null)
            {
                _blogpostsViewModel = new BlogpostsViewModel();
            }
        }
        #endregion

        #region EventListViewModel Property

        private static EventListViewModel _eventListViewModel;

        public static EventListViewModel EventListViewModelStatic
        {
            get
            {
                if (_eventListViewModel == null)
                {
                    CreateEventListViewModel();
                }

                return _eventListViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public EventListViewModel EventListViewModel
        {
            get
            {
                return EventListViewModelStatic;
            }
        }

        public static void ClearEventListViewModel()
        {
            _eventListViewModel.Cleanup();
            _eventListViewModel = null;
        }

        public static void CreateEventListViewModel()
        {
            if (_eventListViewModel == null)
            {
                _eventListViewModel = new EventListViewModel();
            }
        }
        #endregion

        #region EventDetailsViewModel Property
        private static EventDetailsViewModel _eventDetailsViewModel;

        public static EventDetailsViewModel EventDetailsViewModelStatic
        {
            get
            {
                if (_eventDetailsViewModel == null)
                {
                    CreateEventDetailsViewModel();
                }

                return _eventDetailsViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public EventDetailsViewModel EventDetailsViewModel
        {
            get
            {
                return EventDetailsViewModelStatic;
            }
        }

        public static void ClearEventDetailsViewModel()
        {
            _eventDetailsViewModel.Cleanup();
            _eventDetailsViewModel = null;
        }

        public static void CreateEventDetailsViewModel()
        {
            if (_eventDetailsViewModel == null)
            {
                _eventDetailsViewModel = new EventDetailsViewModel();
            }
        }
        #endregion

        #region PersonDetailsViewModel Property
        private static PersonDetailsViewModel _personDetailsViewModel;

        public static PersonDetailsViewModel PersonDetailsViewModelStatic
        {
            get
            {
                if (_personDetailsViewModel == null)
                {
                    CreatePersonDetailsViewModel();
                }

                return _personDetailsViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public PersonDetailsViewModel PersonDetailsViewModel
        {
            get
            {
                return PersonDetailsViewModelStatic;
            }
        }

        public static void ClearPersonDetailsViewModel()
        {
            _personDetailsViewModel.Cleanup();
            _personDetailsViewModel = null;
        }

        public static void CreatePersonDetailsViewModel()
        {
            if (_personDetailsViewModel == null)
            {
                _personDetailsViewModel = new PersonDetailsViewModel();
            }
        }
        #endregion

    }
}