package com.said.data.api.queries;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Said on 26/8/15.
 * Esta clase solo sirve para sobreescribir el método toString()
 * ya que la clave de la cache solo acepta [a-z0-9_-]{1,64} como
 * caracteres de la clave.
 */
public class StringHashMap<K,V> extends HashMap<K,V> {

    public StringHashMap() {
    }

    public StringHashMap(int capacity) {
        super(capacity);
    }

    public StringHashMap(int capacity, float loadFactor) {
        super(capacity, loadFactor);
    }

    public StringHashMap(Map<? extends K, ? extends V> map) {
        super(map);
    }

    @Override
    public String toString() {
        Iterator<Entry<K,V>> i = entrySet().iterator();
        if (!i.hasNext())
            return "";

        StringBuilder sb = new StringBuilder();
        for (;;) {
            Entry<K,V> e = i.next();
            K key = e.getKey();
            V value = e.getValue();
            sb.append(key == this ? "(this Map)" : key);
            sb.append(value == this ? "(this Map)" : value);
            if (!i.hasNext())
                return sb.toString();
        }
    }
}
