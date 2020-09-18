package Main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generic HashMap class created with simple Keys and Values to enable testing
 * @param <K>
 * @param <V>
 */

public class MyHashMap<K, V> implements Map<K, V> {

    private HashMap internalMap = new HashMap();

    @Override
    public int size() {
        return internalMap.size();
    }

    @Override
    public boolean isEmpty() {
        return internalMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return internalMap.containsKey("1");
    }

    @Override
    public boolean containsValue(Object value) {
        return internalMap.containsValue("1");
    }

    @Override
    public V get(Object key) {
        return (V) internalMap.get("1");
    }

    @Override
    public V put(K key, V value) {
        return (V) internalMap.put("1", "1");
    }

    @Override
    public V remove(Object key) {
        return (V) internalMap.remove("1");
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return internalMap.keySet();
    }

    @Override
    public Collection<V> values() {
        return internalMap.values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return internalMap.entrySet();
    }
}
