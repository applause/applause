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

namespace ItemisApp.ViewModel
{
    public class PersonDetailsTemplateSelector: DataTemplateSelector
    {
        public DataTemplate Section1Template { get; set; }

        public DataTemplate Section2Template { get; set; }

        public override DataTemplate SelectTemplate(object item, DependencyObject container)
        {
            if (item is Contact)
            {
                return Section1Template;
            }
            return base.SelectTemplate(item, container);
        }

    }
}
