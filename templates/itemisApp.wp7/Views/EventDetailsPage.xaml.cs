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
using ItemisApp.Model;
using Microsoft.Phone.Shell;

namespace ItemisApp.Views
{
    public partial class EventDetailsPage : PhoneApplicationPage
    {
        public EventDetailsPage()
        {
            InitializeComponent();
        }

        //protected override void OnNavigatedTo(System.Windows.Navigation.NavigationEventArgs e)
        //{
        //    GotoPageMessage msg = (GotoPageMessage)PhoneApplicationService.Current.State["navigation"]; // App.NavigationStack.Peek();
        //    if (msg is GotoPageWithEventMessage)
        //    {
        //        GotoPageWithEventMessage msgWithEvent = (GotoPageWithEventMessage)msg;
        //        Event data = msgWithEvent.Event;
        //        this.DataContext = data;
        //    }
        //    base.OnNavigatedTo(e);
        //}
    }
}