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

        private object ReceiveMessage(GotoPageMessage action)
        {
            //App.NavigationStack.Push(action);
            /*
             * Following code can be used to test serialization of collections (at least Stack cannot be serialized)...
            DataContractSerializer mySerializer = new DataContractSerializer(typeof(Stack<Event>));
            Stack<GotoPageWithEventMessage> stack = new Stack<GotoPageWithEventMessage>();
            stack.Push(action);
            MemoryStream memoryStream = new MemoryStream();
            mySerializer.WriteObject(memoryStream, stack);
            string str = System.Convert.ToBase64String(memoryStream.ToArray());
            System.Diagnostics.Debug.WriteLine(str);
            */

            PhoneApplicationService.Current.State["navigation"] = action;
            NavigationService.Navigate(new Uri("/Views/" + action.PageName, UriKind.Relative));
            return null;
        }

        // Constructor
        public MainPage()
        {
            InitializeComponent();

            Messenger.Default.Register<GotoPageWithEventMessage>(this, (action) => ReceiveMessage(action));
            Messenger.Default.Register<GotoPageWithContactMessage>(this, (action) => ReceiveMessage(action));
            Messenger.Default.Register<NavigationMessage>(this, (action) => NavigationService.Navigate(new Uri(action.PageFQN, UriKind.Relative)));
        }

    }
}