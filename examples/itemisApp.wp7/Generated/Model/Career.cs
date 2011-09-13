using System.Collections.Generic;

namespace ItemisApp.Model
{
    public class Career
    {
		public string Description { get; set; }
		public List<Link> Link { get; set; }
		public List<JobOffer> Job { get; set; }
    }
}
