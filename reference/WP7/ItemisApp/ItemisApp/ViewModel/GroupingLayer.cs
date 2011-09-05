using System;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;
using System.Linq;
using ItemisApp.Model;
using System.Collections;
using System.Collections.Generic;

namespace ItemisApp.ViewModel
{
    public class GroupingLayer<TKey, TElement> : IGrouping<TKey, TElement>
    {
        public TKey Key { get; private set; }
        private IEnumerable<TElement> Collection { get; set; }

        public GroupingLayer(TKey key, IEnumerable<TElement> collection)
        {
            Key = key;
            Collection = collection;
        }

        public IEnumerator<TElement> GetEnumerator()
        {
            return Collection.GetEnumerator();
        }

        IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return Collection.GetEnumerator();
        }

    }
}
