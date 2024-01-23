package ch13.problem.p4;

public class ChildPair<K, V> extends Pair<K, V> {
    // 부모 클래스가 제네릭 타입일 경우 부모 클래스에서 사용한 타입 파라미터를 자식 클래스의 타입 파라미터에 동일하게 작성한다.

    public ChildPair(K key, V value) {
        super(key, value);
    }
}
