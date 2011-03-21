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
using System.Windows.Navigation;

namespace ItemisApp
{
    public partial class SessionDetailsDetailsView : PhoneApplicationPage
    {
        public SessionDetailsDetailsView()
        {
            InitializeComponent();
        }

        protected override void OnNavigatedTo(NavigationEventArgs e)
        {
            string selectedIndex = "";
            if (NavigationContext.QueryString.TryGetValue("itemByIndex", out selectedIndex))
            {
                int index = int.Parse(selectedIndex);
                DataContext = App.RootViewModelProvider.BlogpostsModelProvider().BlogItems[index];
            }
        }
    }
}
