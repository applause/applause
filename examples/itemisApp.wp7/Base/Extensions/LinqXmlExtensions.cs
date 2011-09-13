using System.Linq;
using System.Xml.Linq;

namespace Applause.Extensions
{
    public static class LinqXmlExtensions
    {
        public static XElement ElementAnyNS(this XElement source, string localName)
        {
            var result = source.Elements().Where(e => e.Name.LocalName == localName);
            if (result != null)
            {
                if (result.Count() > 0)
                {
                    return result.First();
                }
                return null;
            }
            else
            {
                return null;
            }
        }
    }
}
