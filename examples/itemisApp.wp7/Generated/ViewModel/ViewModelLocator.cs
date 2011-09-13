using GalaSoft.MvvmLight;
using ItemisApp.DataAccessLayer;

namespace ItemisApp.ViewModel
{
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
                CreateEventListViewModel();
                CreateEventDetailsViewModel();
                CreateOfficeListViewModel();
                CreateOfficeDetailsViewModel();
                CreateBlogListViewModel();
                CreateBlogDetailsViewModel();
                CreatePersonDetailsViewModel();
                CreateCareerViewViewModel();
                CreateJobOfferDetailsViewModel();
                
            }
        }

        public static void Cleanup()
        {
            ClearEventListViewModel();
            ClearEventDetailsViewModel();
            ClearOfficeListViewModel();
            ClearOfficeDetailsViewModel();
            ClearBlogListViewModel();
            ClearBlogDetailsViewModel();
            ClearPersonDetailsViewModel();
            ClearCareerViewViewModel();
            ClearJobOfferDetailsViewModel();
                    
        }
        
        #region EventList Property

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
                _eventListViewModel = new EventListViewModel(new CurrentTimelineContentProvider());
            }
        }
        #endregion
        #region EventDetails Property

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
        #region OfficeList Property

        private static OfficeListViewModel _officeListViewModel;
        public static OfficeListViewModel OfficeListViewModelStatic
        {
            get
            {
                if (_officeListViewModel == null)
                {
                    CreateOfficeListViewModel();
                }
                return _officeListViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public OfficeListViewModel OfficeListViewModel
        {
            get
            {
                return OfficeListViewModelStatic;
            }
        }

        public static void ClearOfficeListViewModel()
        {
            _officeListViewModel.Cleanup();
            _officeListViewModel = null;
        }

        public static void CreateOfficeListViewModel()
        {
            if (_officeListViewModel == null)
            {
                _officeListViewModel = new OfficeListViewModel(new CompanyDescriptionContentProvider());
            }
        }
        #endregion
        #region OfficeDetails Property

        private static OfficeDetailsViewModel _officeDetailsViewModel;
        public static OfficeDetailsViewModel OfficeDetailsViewModelStatic
        {
            get
            {
                if (_officeDetailsViewModel == null)
                {
                    CreateOfficeDetailsViewModel();
                }
                return _officeDetailsViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public OfficeDetailsViewModel OfficeDetailsViewModel
        {
            get
            {
                return OfficeDetailsViewModelStatic;
            }
        }

        public static void ClearOfficeDetailsViewModel()
        {
            _officeDetailsViewModel.Cleanup();
            _officeDetailsViewModel = null;
        }

        public static void CreateOfficeDetailsViewModel()
        {
            if (_officeDetailsViewModel == null)
            {
                _officeDetailsViewModel = new OfficeDetailsViewModel();
            }
        }
        #endregion
        #region BlogList Property

        private static BlogListViewModel _blogListViewModel;
        public static BlogListViewModel BlogListViewModelStatic
        {
            get
            {
                if (_blogListViewModel == null)
                {
                    CreateBlogListViewModel();
                }
                return _blogListViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public BlogListViewModel BlogListViewModel
        {
            get
            {
                return BlogListViewModelStatic;
            }
        }

        public static void ClearBlogListViewModel()
        {
            _blogListViewModel.Cleanup();
            _blogListViewModel = null;
        }

        public static void CreateBlogListViewModel()
        {
            if (_blogListViewModel == null)
            {
                _blogListViewModel = new BlogListViewModel(new BlogpostsContentProvider());
            }
        }
        #endregion
        #region BlogDetails Property

        private static BlogDetailsViewModel _blogDetailsViewModel;
        public static BlogDetailsViewModel BlogDetailsViewModelStatic
        {
            get
            {
                if (_blogDetailsViewModel == null)
                {
                    CreateBlogDetailsViewModel();
                }
                return _blogDetailsViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public BlogDetailsViewModel BlogDetailsViewModel
        {
            get
            {
                return BlogDetailsViewModelStatic;
            }
        }

        public static void ClearBlogDetailsViewModel()
        {
            _blogDetailsViewModel.Cleanup();
            _blogDetailsViewModel = null;
        }

        public static void CreateBlogDetailsViewModel()
        {
            if (_blogDetailsViewModel == null)
            {
                _blogDetailsViewModel = new BlogDetailsViewModel();
            }
        }
        #endregion
        #region PersonDetails Property

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
        #region CareerView Property

        private static CareerViewViewModel _careerViewViewModel;
        public static CareerViewViewModel CareerViewViewModelStatic
        {
            get
            {
                if (_careerViewViewModel == null)
                {
                    CreateCareerViewViewModel();
                }
                return _careerViewViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public CareerViewViewModel CareerViewViewModel
        {
            get
            {
                return CareerViewViewModelStatic;
            }
        }

        public static void ClearCareerViewViewModel()
        {
            _careerViewViewModel.Cleanup();
            _careerViewViewModel = null;
        }

        public static void CreateCareerViewViewModel()
        {
            if (_careerViewViewModel == null)
            {
                _careerViewViewModel = new CareerViewViewModel(new CareerDataContentProvider());
            }
        }
        #endregion
        #region JobOfferDetails Property

        private static JobOfferDetailsViewModel _jobOfferDetailsViewModel;
        public static JobOfferDetailsViewModel JobOfferDetailsViewModelStatic
        {
            get
            {
                if (_jobOfferDetailsViewModel == null)
                {
                    CreateJobOfferDetailsViewModel();
                }
                return _jobOfferDetailsViewModel;
            }
        }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Performance",
            "CA1822:MarkMembersAsStatic",
            Justification = "This non-static member is needed for data binding purposes.")]
        public JobOfferDetailsViewModel JobOfferDetailsViewModel
        {
            get
            {
                return JobOfferDetailsViewModelStatic;
            }
        }

        public static void ClearJobOfferDetailsViewModel()
        {
            _jobOfferDetailsViewModel.Cleanup();
            _jobOfferDetailsViewModel = null;
        }

        public static void CreateJobOfferDetailsViewModel()
        {
            if (_jobOfferDetailsViewModel == null)
            {
                _jobOfferDetailsViewModel = new JobOfferDetailsViewModel();
            }
        }
        #endregion
        
    }
}
