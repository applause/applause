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
			NewsBlogListListBox.DataContext = App.RootViewModelProvider.BlogpostsModelProvider();
			MondaySessionListListBox.DataContext = App.RootViewModelProvider.SessionsByDayModelProvider("2011-03-21");
			TuesdaySessionListListBox.DataContext = App.RootViewModelProvider.SessionsByDayModelProvider("2011-03-22");
			WednesdaySessionListListBox.DataContext = App.RootViewModelProvider.SessionsByDayModelProvider("2011-03-23");
			ThursdaySessionListListBox.DataContext = App.RootViewModelProvider.SessionsByDayModelProvider("2011-03-24");
			SpeakersSpeakersListListBox.DataContext = App.RootViewModelProvider.AllSpeakersModelProvider();
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
		
		private void NewsBlogList_SelectionChanged(object sender, SelectionChangedEventArgs e)
		{
			if (NewsBlogListListBox.SelectedIndex == -1)
				return;
			NavigationService.Navigate(new Uri("/Generated/BlogDetailsDetailsView.xaml?itemByIndex=" + NewsBlogListListBox.SelectedIndex, UriKind.Relative));
						
		}

		private void MondaySessionList_SelectionChanged(object sender, SelectionChangedEventArgs e)
		{
			if (MondaySessionListListBox.SelectedIndex == -1)
				return;
			NavigationService.Navigate(new Uri("/Generated/SessionDetailsDetailsView.xaml?itemByIndex=" + MondaySessionListListBox.SelectedIndex, UriKind.Relative));
						
		}

		private void TuesdaySessionList_SelectionChanged(object sender, SelectionChangedEventArgs e)
		{
			if (TuesdaySessionListListBox.SelectedIndex == -1)
				return;
			NavigationService.Navigate(new Uri("/Generated/SessionDetailsDetailsView.xaml?itemByIndex=" + TuesdaySessionListListBox.SelectedIndex, UriKind.Relative));
						
		}

		private void WednesdaySessionList_SelectionChanged(object sender, SelectionChangedEventArgs e)
		{
			if (WednesdaySessionListListBox.SelectedIndex == -1)
				return;
			NavigationService.Navigate(new Uri("/Generated/SessionDetailsDetailsView.xaml?itemByIndex=" + WednesdaySessionListListBox.SelectedIndex, UriKind.Relative));
						
		}

		private void ThursdaySessionList_SelectionChanged(object sender, SelectionChangedEventArgs e)
		{
			if (ThursdaySessionListListBox.SelectedIndex == -1)
				return;
			NavigationService.Navigate(new Uri("/Generated/SessionDetailsDetailsView.xaml?itemByIndex=" + ThursdaySessionListListBox.SelectedIndex, UriKind.Relative));
						
		}

		private void SpeakersSpeakersList_SelectionChanged(object sender, SelectionChangedEventArgs e)
		{
			if (SpeakersSpeakersListListBox.SelectedIndex == -1)
				return;
			NavigationService.Navigate(new Uri("/Generated/SpeakerDetailsDetailsView.xaml?itemByIndex=" + SpeakersSpeakersListListBox.SelectedIndex, UriKind.Relative));
						
		}
	}
}
