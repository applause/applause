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
using System.Collections;
using System.Collections.Generic;

namespace ItemisApp.Model
{
    public class Event
    {
        public string Id { get; set; }
        public string Kind { get; set; }
        public string Title { get; set; }
        public string Date { get; set; }
        public string Location { get; set; }
        public string Description { get; set; }
        public string Contact { get; set; }
        public string Link { get; set; }
        public List<Contact> Speakers { get; set; }
    }
}
