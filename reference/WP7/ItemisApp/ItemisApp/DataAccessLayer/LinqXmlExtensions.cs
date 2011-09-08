using System.Linq;
using System.Xml.Linq;

namespace ItemisApp.DataAccessLayer
{
    public static class LinqXmlExtensions
    {
        public static XElement ElementAnyNS(this XElement source, string localName)
        {
            return source.Elements().Where(e => e.Name.LocalName == localName).First();
        }
    }
}
