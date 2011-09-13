using System.Collections.Generic;

namespace ItemisApp.Model
{
    public class Event
    {
		public string Id { get; set; }
		public string Kind { get; set; }
		public string Title { get; set; }
		public string Date { get; set; }
		public string Location { get; set; }
		public string Description { get; set; }
		public string Contact { get; set; }
		public string Url { get; set; }
		public List<Contact> Speakers { get; set; }
    }
}
