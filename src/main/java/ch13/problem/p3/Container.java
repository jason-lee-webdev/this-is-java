package ch13.problem.p3;

// ContainerExample 클래스의 main() 메소드는 Container 제네릭 타입을 사용하고 있습니다.
// main() 메소드에서 사용하는 방법을 참고해서 Container 제네릭 타입을 선언해보세요.

public class Container<K, V> {

    // 필드
    private K key;
    private V value;

    // getter & setter
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
