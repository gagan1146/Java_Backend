package org.example.Generics;

interface Pair<K, V> {
    K getKey();
    V getValue();
}

class KeyValuePair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

public class BasicGenericClass {
    static void main(String[] args) {
        Pair<String, Integer> pair = new KeyValuePair<>("Age", 30);
        System.out.println(pair.getKey() + ": " + pair.getValue());
    }
}
