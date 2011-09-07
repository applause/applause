using System.Collections;
using System.Collections.Generic;
using System.Linq;

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
