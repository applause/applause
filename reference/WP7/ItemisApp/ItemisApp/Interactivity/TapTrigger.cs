using System;

namespace ItemisApp.Interactivity
{
    public class TapTrigger : GestureTrigger
    {
        protected override void Listen(Microsoft.Phone.Controls.GestureListener listener)
        {
            listener.Tap += new EventHandler<Microsoft.Phone.Controls.GestureEventArgs>(listener_Tap);
        }

        protected override void EndListen(Microsoft.Phone.Controls.GestureListener listener)
        {
            listener.Tap -= new EventHandler<Microsoft.Phone.Controls.GestureEventArgs>(listener_Tap);
        }

        void listener_Tap(object sender, Microsoft.Phone.Controls.GestureEventArgs e)
        {
            Invoke(e);
        }
    }
}
