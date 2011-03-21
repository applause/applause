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
using ItemisApp.ViewModels;

namespace ItemisApp
{
	public partial class MainPage : PhoneApplicationPage
	{
		// Constructor
		public MainPage()
		{
			InitializeComponent();
			NewsBlogListListBox.DataContext = App.RootViewModelProvider.BlogpostsModelProvider();
			Tuesday2SessionListListBox.DataContext = App.RootViewModelProvider.SessionsByDayModelProvider("2011-03-22");
			WednesdaySessionListListBox.DataContext = App.RootViewModelProvider.SessionsByDayModelProvider("2011-03-23");
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

		private void NewsListBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
		{
			if (NewsListBox.SelectedIndex == -1)
				return;

			BlogItemViewModel selectedItem = App.RootViewModelProvider.BlogItemsViewModelProvider.BlogItems[NewsListBox.SelectedIndex];
			NavigationService.Navigate(new Uri("/DetailsPage.xaml?itemByIndex=" + NewsListBox.SelectedIndex, UriKind.Relative));

			NewsListBox.SelectedIndex = -1;
		}

		private void MondayListBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
		{
			if (MondayListBox.SelectedIndex == -1)
				return;
			NavigationService.Navigate(new Uri("/SessionDetailsPage.xaml?itemByIndex=" + MondayListBox.SelectedIndex, UriKind.Relative));
		}
	}
}
