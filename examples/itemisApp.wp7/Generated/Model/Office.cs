using System.Collections.Generic;

namespace ItemisApp.Model
{
    public class Office
    {
		public string Id { get; set; }
		public string Location { get; set; }
		public string Summary { get; set; }
		public string Pictureurl { get; set; }
		public Contact Contact { get; set; }
		public string Phone { get; set; }
		public string Mail { get; set; }
		public string Address { get; set; }
		public string Geo { get; set; }
    }
}
