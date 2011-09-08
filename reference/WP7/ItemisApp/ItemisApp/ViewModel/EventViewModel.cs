using System.Collections;
using System.Collections.Generic;
using System.Windows;
using GalaSoft.MvvmLight;
using GalaSoft.MvvmLight.Messaging;
using ItemisApp.Model;
using GalaSoft.MvvmLight.Command;
using ItemisApp.Views;

namespace ItemisApp.ViewModel
{
    public class EventViewModel : ViewModelBase
    {
        public EventViewModel()
        {
            if (IsInDesignMode)
            {
                Event = new Event()
                {
                    Id = "17",
                    Date = "7.9.2011",
                    Description = "This is just a dummy event.",
                    Kind = "Workshop",
                    Location = "San Francisco",
                    Title = "This is the dummy title.",
                    Contact = "John Doe",
                    Link = "http://demo.com",
                    Speakers = new List<Contact>()
                    {
                        new Contact() {
                            Name = "Peter Friese",
                            Bio = "A really nice and alround together guy.",
                            Mail = "peter@peterfriese.de",
                            Role = "Software Architect"
                        },
                        new Contact() {
                            Name = "Heiko Behrens",
                            Bio = "CEO of BeamApp",
                            Mail = "heikobehrens@gmx.net",
                            Role = "CEO"
                        }
                    }
                };
            }
            else
            {
            }

            //Messenger.Default.Register<PropertyChangedMessage<Event>>(this, (action) => DispatcherHelper.CheckBeginInvokeOnUI( () => this.Event = action.NewValue ));
            Messenger.Default.Register<PropertyChangedMessage<Event>>(this, (action) => this.Event = action.NewValue);
        }

        #region Event Property

        public const string EventPropertyName = "Event";
        private Event _event = null;

        public Event Event
        {
            get
            {
                return _event;
            }

            set
            {
                if (_event == value)
                {
                    return;
                }

                var oldValue = _event;
                _event = value;
                PrepareData();

                RaisePropertyChanged(EventPropertyName);
            }
        }
        #endregion

        private void PrepareData()
        {
            /**
                section {
		            cell Subtitle {
			        text= event.contact
			        details= "Contact"
			        action= PersonDetails(PersonByName(event.contact))
		            }
	            }
             */
            GroupingLayer<string, string> section1 = new GroupingLayer<string, string>("Contact", new List<string>() {Event.Contact });

            /**
	            section {
		                cell Subtitle foreach event.speakers as s {
			            text= s.name
			            details= s.role
			            action= PersonDetails(PersonByName(s.name))
		            }
	            }             
             */
            GroupingLayer<string, Contact> section2 = new GroupingLayer<string, Contact>("Speakers", Event.Speakers);

            Deployment.Current.Dispatcher.BeginInvoke(() =>
            {
                var prepareSections = new List<IEnumerable>();
                prepareSections.Add(section1);
                prepareSections.Add(section2);
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


        #region Selected Contact Property

        public const string SelectedContactPropertyName = "SelectedContact";
        private Contact _selectedContact = null;

        public Contact SelectedContact
        {
            get
            {
                return _selectedContact;
            }

            set
            {
                if (_selectedContact == value)
                {
                    return;
                }

                var oldValue = _selectedContact;
                _selectedContact = value;

                RaisePropertyChanged(SelectedContactPropertyName, oldValue, value, true);
            }
        }
        #endregion


        #region Goto Contact Details Page Property

        private RelayCommand<Contact> _gotoContactDetailsCommand;

        public RelayCommand<Contact> GotoContactDetailsCommand
        {
            get
            {
                return _gotoContactDetailsCommand ?? (_gotoContactDetailsCommand = new RelayCommand<Contact>(
                    (theContact) =>
                    {
                        var msg = new GotoPageWithContactMessage() { PageName = "PersonDetailsPage" + ".xaml", Contact = theContact };
                        Messenger.Default.Send<GotoPageWithContactMessage>(msg);
                    }));
            }
        }
        #endregion

    }
}