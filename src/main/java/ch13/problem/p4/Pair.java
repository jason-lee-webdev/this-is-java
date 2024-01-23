package ch13.problem.p4;

public class Pair<K, V> {

    // 필드
    private K key;
    private V value;

    // 생성자
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // getter
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
