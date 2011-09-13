using System.Collections.Generic;

namespace ItemisApp.Model
{
    public class Speaker
    {
		public string Id { get; set; }
		public string Name { get; set; }
		public string Bio { get; set; }
		public string Pictureurl { get; set; }
		public List<Session> Sessions { get; set; }
    }
}
