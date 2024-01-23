package ch13.problem.p2;

// ContainerExample 클래스의 main() 메소드는 Container 제네릭 타입을 사용하고 있습니다.
// main() 메소드에서 사용하는 방법을 참고해서 Container 제네릭 타입을 선언해보세요.

public class Container<T> {

    // 필드
    private T content;

    // getter & setter
    public T get() {
        return content;
    }

    public void set(T content) {
        this.content = content;
    }
}
