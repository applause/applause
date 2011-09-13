using System.Collections.Generic;

namespace ItemisApp.Model
{
    public class Session
    {
		public string Id { get; set; }
		public string Title { get; set; }
		public string Description { get; set; }
		public string Date { get; set; }
		public string Timeslot { get; set; }
		public string Room { get; set; }
		public List<Speaker> Speakers { get; set; }
    }
}
