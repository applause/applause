using System.Net;

namespace Applause.Extensions
{
    public static class StringExtensions
    {
        public static string URLEncode(this string source)
        {
            return HttpUtility.UrlEncode(source).Replace("+", "%20");
        }
    }
}
