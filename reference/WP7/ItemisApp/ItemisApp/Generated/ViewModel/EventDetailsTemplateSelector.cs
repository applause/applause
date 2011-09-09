using System.Windows;
using Applause.ViewModel;
using ItemisApp.Model;

namespace ItemisApp.ViewModel
{
    public class EventDetailsTemplateSelector: DataTemplateSelector
    {
        public DataTemplate Section1Template { get; set; }

        public DataTemplate Section2Template { get; set; }

        public override DataTemplate SelectTemplate(object item, DependencyObject container)
        {
            if (item is string)
            {
                return Section1Template;
            }
            else if (item is Contact)
            {
                return Section2Template;
            }
            return base.SelectTemplate(item, container);
        }

    }
}
