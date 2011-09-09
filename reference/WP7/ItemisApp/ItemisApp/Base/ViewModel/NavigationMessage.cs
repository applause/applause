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
using GalaSoft.MvvmLight;

namespace Applause.ViewModel
{
    public class NavigationMessage
    {
        public string PageName { get; set; }
        public string PageFQN
        {
            get
            {
                return "/Views/" + PageName + ".xaml";
            }
        }

        public string ViewModelName { get; set; }

        private Dictionary<string, object> _payload;
        public Dictionary<string, object> Payload
        {
            get
            {
                if (_payload == null)
                {
                    _payload = new Dictionary<string, object>();
                }
                return _payload;
            }
        }
    }
}
