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
using System.Collections.Generic;
using System.Collections.ObjectModel;

namespace ItemisApp.Model
{
    public class AllEvents
    {
        public List<Event> News { get; set; }

        public List<Event> Activity { get; set; }

        public List<Event> Workshop { get; set; }
    }
}
