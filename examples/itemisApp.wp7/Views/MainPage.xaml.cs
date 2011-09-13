using System;
using System.Windows.Controls;
using Applause.ViewModel;
using GalaSoft.MvvmLight.Messaging;
using Microsoft.Phone.Controls;

namespace ItemisApp.Views
{
    public partial class MainPage : PhoneApplicationPage
    {
        public MainPage()
        {
            InitializeComponent();
            TiltEffect.TiltableItems.Add(typeof(StackPanel));
            Messenger.Default.Register<NavigationMessage>(this, (action) => NavigationService.Navigate(new Uri(action.PageFQN, UriKind.Relative)));
        }
    }
}
