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
using ItemisApp.Views;
using Microsoft.Phone.Shell;
using GalaSoft.MvvmLight.Messaging;
using System.Runtime.Serialization;
using ItemisApp.Model;
using System.IO;

namespace ItemisApp
{
    public partial class MainPage : PhoneApplicationPage
    {
        public MainPage()
        {
            InitializeComponent();
            Messenger.Default.Register<NavigationMessage>(this, (action) => NavigationService.Navigate(new Uri(action.PageFQN, UriKind.Relative)));
        }
    }
}