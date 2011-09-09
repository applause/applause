using System.Windows;
using Applause.ViewModel;
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
