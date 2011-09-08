using System.Windows;
using System.Windows.Interactivity;
using System.Linq;

using Microsoft.Phone.Controls;

namespace ItemisApp.Interactivity
{
    public abstract class GestureTrigger : TriggerBase<FrameworkElement>
    {
        protected GestureTrigger()
        {
        }

        protected abstract void Listen(GestureListener listener);
        protected abstract void EndListen(GestureListener listener);

        protected override void OnAttached()
        {
            Listen(GestureService.GetGestureListener(AssociatedObject));

            base.OnAttached();
        }

        protected override void OnDetaching()
        {
            EndListen(GestureService.GetGestureListener(AssociatedObject));

            base.OnDetaching();
        }

        protected void Invoke(GestureEventArgs e)
        {
            if (Enabled)
                InvokeActions(e);
        }

        public bool Enabled
        {
            get
            {
                GestureBehavior behavior = Interaction.GetBehaviors(AssociatedObject).OfType<GestureBehavior>().FirstOrDefault();
                if (behavior != null)
                    return behavior.Enabled;

                return false;
            }
        }
    }
}
