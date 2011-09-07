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
        public string Name { get; set; }
	    public string Role { get; set; }
        public string Bio { get; set; }
	    public string Pictureurl { get; set; }
	    public string Mail { get; set; }
        public string Phone { get; set; }
    }
}
