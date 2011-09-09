using System.Collections;
using System.Collections.Generic;
using System.Windows;
using Applause.ViewModel;
using GalaSoft.MvvmLight;
using GalaSoft.MvvmLight.Command;
using GalaSoft.MvvmLight.Messaging;
using ItemisApp.DataAccessLayer;
using ItemisApp.Model;
using ItemisApp.Views;
using Microsoft.Phone.Tasks;

namespace ItemisApp.ViewModel
{
    public class PersonDetailsViewModel : ViewModelBase
    {
        public PersonDetailsViewModel()
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
            Messenger.Default.Register<NavigationMessage>(this,
                (action) =>
                {
                    if (action.ViewModelName.Equals("PersonDetailsViewModel"))
                    {
                        string name = (string)action.Payload["name"];
                        LoadData(name);
                    }
                }
            );
        }

        #region Data Source

        // needs to be invoked externally during navigation or view composition
        public void LoadData(string name)
        {
            PersonByNameContentProvider provider = new PersonByNameContentProvider();
            provider.LoadData(name, AcceptData);
        }

        public void AcceptData(object result)
        {
            if (result is Contact)
            {
                Contact = (Contact)result;
            }
        }

        #endregion

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

        #region Navigation
        public RelayCommand<string> Section1NavigationCommand
        {
            get
            {
                return new RelayCommand<string>(
                    (action) =>
                    {
                        if (action.IndexOf("tel:") == 0)
                        {
                            PhoneCallTask task = new PhoneCallTask();
                            task.PhoneNumber = action.Substring("tel:".Length);
                            task.Show();
                        }
                        else if (action.IndexOf("mailto:") == 0)
                        {
                            EmailComposeTask task = new EmailComposeTask();
                            task.To = action.Substring("mailto:".Length);
                            task.Show();
                        }
                    });
            }
        }

        public RelayCommand<string> Section2NavigationCommand
        {
            get
            {
                return new RelayCommand<string>(
                    (name) =>
                    {
                    });
            }
        }
        #endregion

    }
}