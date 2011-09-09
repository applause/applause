using System.Windows.Data;
using System;
using System.Globalization;

namespace ItemisApp.Converters
{
    public class StringFormatConverter : IValueConverter
    {
        public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
        {
            if (parameter == null && value == null)
                return String.Empty;

            if (parameter == null)
                return value.ToString();

            return String.Format(CultureInfo.CurrentCulture, parameter.ToString(), value);
        }

        public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
        {
            throw new NotSupportedException();
        }
    }
}