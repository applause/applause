using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;
using Microsoft.Phone.Controls;

namespace ItemisApp
{
	public partial class MainPage : PhoneApplicationPage
	{
		// Constructor
		public MainPage()
		{
			InitializeComponent();
			ApplauseCommitListListBox.DataContext = App.RootViewModelProvider.AllCommitsByRepositoryModelProvider("applause/applause");
			ERROR.DataContext = App.RootViewModelProvider.UserDataModelProvider("peterfriese");
			ERROR.DataContext = App.RootViewModelProvider.UserDataModelProvider("hbehrens");
			this.Loaded += new RoutedEventHandler(MainPage_Loaded);
		}

		// Load data for the ViewModel Items
		private void MainPage_Loaded(object sender, RoutedEventArgs e)
		{
			if (!App.RootViewModelProvider.IsDataLoaded)
			{
				App.RootViewModelProvider.LoadData();
			}
		}
		
		private void ApplauseCommitList_SelectionChanged(object sender, SelectionChangedEventArgs e)
		{
			if (ApplauseCommitListListBox.SelectedIndex == -1)
				return;
			NavigationService.Navigate(new Uri("/Generated/UserDetailsDetailsView.xaml?itemByIndex=" + ApplauseCommitListListBox.SelectedIndex, UriKind.Relative));
						
		}

		private void ERROR(object sender, SelectionChangedEventArgs e)
		{
			if (ERROR.SelectedIndex == -1)
				return;
			NavigationService.Navigate(new Uri("/Generated/RepositoryListTableView.xaml?itemByIndex=" + ERROR.SelectedIndex, UriKind.Relative));
						
		}

		private void ERROR(object sender, SelectionChangedEventArgs e)
		{
			if (ERROR.SelectedIndex == -1)
				return;
			NavigationService.Navigate(new Uri("/Generated/RepositoryListTableView.xaml?itemByIndex=" + ERROR.SelectedIndex, UriKind.Relative));
						
		}
	}
}
