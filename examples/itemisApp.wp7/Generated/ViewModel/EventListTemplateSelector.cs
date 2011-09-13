using System.Windows;
using Applause.ViewModel;
using ItemisApp.Model;

namespace ItemisApp.ViewModel
{
    public class EventListTemplateSelector: DataTemplateSelector
    {
        public DataTemplate Section1Template { get; set; }
        public DataTemplate Section2Template { get; set; }
        public DataTemplate Section3Template { get; set; }

        public override DataTemplate SelectTemplate(object item, DependencyObject container)
        {
            return base.SelectTemplate(item, container);
        }

    }
}
