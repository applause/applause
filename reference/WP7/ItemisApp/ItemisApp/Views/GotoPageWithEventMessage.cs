using System;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;
using ItemisApp.Model;
using System.Runtime.Serialization;

namespace ItemisApp.Views
{
    [DataContract]
    public class GotoPageWithEventMessage: GotoPageMessage
    {
        [DataMember]
        public Event Event { get; set; }
    }
}
