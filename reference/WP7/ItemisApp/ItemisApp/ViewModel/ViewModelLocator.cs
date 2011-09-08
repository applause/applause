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
        private static MainViewModel _main;

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
                CreateAllEventsViewModel();
                CreateEventViewModel();
                CreateContactViewModel();
            }

            CreateMain();
        }

        #region Main Property

        public static MainViewModel MainStatic
        {
            get
            {
                if (_main == null)
                {
                    CreateMain();
                }

                return _main;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public MainViewModel Main
        {
            get
            {
                return MainStatic;
            }
        }

        public static void ClearMain()
        {
            _main.Cleanup();
            _main = null;
        }

        public static void CreateMain()
        {
            if (_main == null)
            {
                _main = new MainViewModel();
            }
        }
        #endregion

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

        #region AllEvents Property

        private static AllEventsViewModel _allEventsViewModel;

        public static AllEventsViewModel AllEventsViewModelStatic
        {
            get
            {
                if (_allEventsViewModel == null)
                {
                    CreateAllEventsViewModel();
                }

                return _allEventsViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public AllEventsViewModel AllEventsViewModel
        {
            get
            {
                return AllEventsViewModelStatic;
            }
        }

        public static void ClearAllEventsViewModel()
        {
            _allEventsViewModel.Cleanup();
            _allEventsViewModel = null;
        }

        public static void CreateAllEventsViewModel()
        {
            if (_allEventsViewModel == null)
            {
                _allEventsViewModel = new AllEventsViewModel();
            }
        }
        #endregion

        #region Event Property
        private static EventViewModel _eventViewModel;

        public static EventViewModel EventViewModelStatic
        {
            get
            {
                if (_eventViewModel == null)
                {
                    CreateEventViewModel();
                }

                return _eventViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public EventViewModel EventViewModel
        {
            get
            {
                return EventViewModelStatic;
            }
        }

        public static void ClearEventViewModel()
        {
            _eventViewModel.Cleanup();
            _eventViewModel = null;
        }

        public static void CreateEventViewModel()
        {
            if (_eventViewModel == null)
            {
                _eventViewModel = new EventViewModel();
            }
        }
        #endregion

        #region Contact Property
        private static ContactViewModel _contactViewModel;

        public static ContactViewModel ContactViewModelStatic
        {
            get
            {
                if (_contactViewModel == null)
                {
                    CreateContactViewModel();
                }

                return _contactViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public ContactViewModel ContactViewModel
        {
            get
            {
                return ContactViewModelStatic;
            }
        }

        public static void ClearContactViewModel()
        {
            _contactViewModel.Cleanup();
            _contactViewModel = null;
        }

        public static void CreateContactViewModel()
        {
            if (_contactViewModel == null)
            {
                _contactViewModel = new ContactViewModel();
            }
        }
        #endregion

        public static void Cleanup()
        {
            ClearMain();
            ClearBlogpostsViewModel();
            ClearAllEventsViewModel();
            ClearEventViewModel();
            ClearContactViewModel();
        }
    }
}