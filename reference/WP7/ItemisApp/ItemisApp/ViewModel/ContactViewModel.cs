using System.Collections;
using System.Collections.Generic;
using System.Windows;
using GalaSoft.MvvmLight;
using GalaSoft.MvvmLight.Messaging;
using ItemisApp.Model;

namespace ItemisApp.ViewModel
{
    public class ContactViewModel : ViewModelBase
    {
        public ContactViewModel()
        {
            if (IsInDesignMode)
            {
                Contact = new Contact()
                {
                    Name = "Peter Friese",
                    Bio = "A really nice and alround together guy and a hoopy frood. Works hard and can get really pissed when you tell him his overtime is worth a sh*t.",
                    Mail = "peter@peterfriese.de",
                    Role = "Software Architect",
                    Phone = "+49 151 108 604 72",
                    Pictureurl = "https://lh6.googleusercontent.com/-U8Raci4Lyro/AAAAAAAAAAI/AAAAAAAAADc/XvjvkoRFik8/photo.jpg?sz=48"
                };
            }
            else
            {
            }

            //Messenger.Default.Register<PropertyChangedMessage<Event>>(this, (action) => DispatcherHelper.CheckBeginInvokeOnUI( () => this.Event = action.NewValue ));
            Messenger.Default.Register<PropertyChangedMessage<Contact>>(this, (action) => this.Contact = action.NewValue);
        }

        #region Contact Property

        public const string ContactPropertyName = "Contact";
        private Contact _contact = null;

        public Contact Contact
        {
            get
            {
                return _contact;
            }

            set
            {
                if (_contact == value)
                {
                    return;
                }

                var oldValue = _contact;
                _contact = value;
                PrepareData();

                RaisePropertyChanged(ContactPropertyName);
            }
        }
        #endregion

        private void PrepareData()
        {
            /**
	            section {
		            cell Value2 {
			            text= "mail"
			            details= person.mail
			            action= ("mailto:" person.mail)
		            }
		            cell Value2 {
			            text= "phone"
			            details= person.phone
			            action= ("tel:" person.phone)
		            }
	            }
             */
            GroupingLayer<string, Contact> section1 = new GroupingLayer<string, Contact>("Contact", new List<Contact>() { Contact });

            Deployment.Current.Dispatcher.BeginInvoke(() =>
            {
                var prepareSections = new List<IEnumerable>();
                prepareSections.Add(section1);
                Sections = prepareSections;
            });
        }

        #region Sections Property

        public const string SectionsPropertyName = "Sections";
        private List<IEnumerable> sections;

        public List<IEnumerable> Sections
        {
            get
            {
                return sections;
            }

            set
            {
                if (sections == value)
                {
                    return;
                }

                var oldValue = sections;
                sections = value;

                // Update bindings, no broadcast
                RaisePropertyChanged(SectionsPropertyName);
            }
        }
        #endregion
    }
}