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

namespace ItemisApp.Model
{
    public class Contact
    {
        public string name { get; set; }
	    public string role { get; set; }
        public string bio { get; set; }
	    public string pictureurl { get; set; }
	    public string mail { get; set; }
        public string phone { get; set; }
    }
}
