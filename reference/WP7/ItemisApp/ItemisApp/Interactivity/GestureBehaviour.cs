using System.Windows;
using System.Windows.Interactivity;
using System;
using System.Windows.Input;

using Microsoft.Phone.Controls;

namespace ItemisApp.Interactivity
{
    public class GestureBehavior : Behavior<FrameworkElement>
    {
        public static readonly DependencyProperty EnabledProperty = DependencyProperty.Register(
           "Enabled",
           typeof(bool),
           typeof(GestureBehavior),
           new PropertyMetadata(true));

        public GestureBehavior()
        {
        }

        public bool Enabled
        {
            get
            {
                return (bool)GetValue(EnabledProperty);
            }

            set
            {
                SetValue(EnabledProperty, value);
            }
        }
    }
}
