using System.Linq;
using System.Xml.Linq;
using System.Collections;
using System.Collections.Generic;

namespace Applause.Extensions
{
    public static class LinqXmlExtensions
    {
    	
        public static IEnumerable<XElement> DescendantsAnyNS(this XDocument source, string localName) 
        {
            return source.Descendants().Where(e => e.Name.LocalName == localName);
        }
    	
        public static XElement ElementAnyNS(this XElement source, string localName)
        {
            if (source.Elements().Count() > 0)
            {
                return source.Elements().Where(e => e.Name.LocalName == localName).FirstOrDefault();
            }
            else
            {
                return null;
            }
        }
    }
}
