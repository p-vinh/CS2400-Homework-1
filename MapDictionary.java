import java.util.HashMap;
import java.util.Map;


public class MapDictionary<K, V> implements InterfaceDictionary<K, V> {
    private Map<K, V> map;


    public MapDictionary() {
        map = new HashMap<>();

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
        return null;
    }

    public Iterator<V> getValueIterator() {
        return null;
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

}