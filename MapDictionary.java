import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapDictionary<K, V> implements InterfaceDictionary<K, V> {
	private Map<K, V> map;

	public MapDictionary() {
		map = new HashMap<>(1136);
	}

	public V add(K key, V value) {
		return map.put(key, value);
	}

	public V remove(K key) {
		return map.remove(key);
	}

	public V getValue(K key) {
		return map.get(key);
	}

	public boolean contains(K key) {
		return map.containsKey(key);
	}

	public Iterator<K> getKeyIterator() {

		return map.keySet().iterator();
	}

	public Iterator<V> getValueIterator() {
		throw new UnsupportedOperationException("getValueIterator");
	}

	public boolean isEmpty() {
		return map.isEmpty();
	}

	public int getSize() {
		return map.size();
	}

	public void clear() {
		map.clear();
	}

	private class Iterator<T> {
		private Iterator<T> iter;

		private Iterator() {
			iter = new Iterator<>();
		}

		private boolean hasNext() {
			return iter.hasNext();
		}

		private T next() {
			return iter.next();
		}
	}
}