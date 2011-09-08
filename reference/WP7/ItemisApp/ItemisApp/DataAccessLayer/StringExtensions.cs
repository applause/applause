using System.Net;

namespace ItemisApp.DataAccessLayer
{
    public static class StringExtensions
    {
        public static string URLEncode(this string source)
        {
            return HttpUtility.UrlEncode(source).Replace("+", "%20");
        }
    }
}
