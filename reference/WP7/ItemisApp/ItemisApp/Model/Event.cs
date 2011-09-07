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
using System.Runtime.Serialization;

namespace ItemisApp.Model
{
    [DataContract]
    public class Event
    {
        [DataMember]
        public string Id { get; set; }

        [DataMember]
        public string Kind { get; set; }

        [DataMember]
        public string Title { get; set; }

        [DataMember]
        public string Date { get; set; }

        [DataMember]
        public string Location { get; set; }

        [DataMember]
        public string Description { get; set; }

        [DataMember]
        public string Contact { get; set; }

        [DataMember]
        public string Link { get; set; }
    }
}
