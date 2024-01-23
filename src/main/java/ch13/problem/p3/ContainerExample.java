package ch13.problem.p3;

// ContainerExample 클래스의 main() 메소드는 Container 제네릭 타입을 사용하고 있습니다.
// main() 메소드에서 사용하는 방법을 참고해서 Container 제네릭 타입을 선언해보세요.

public class ContainerExample {

    public static void main(String[] args) {
        Container<String, String> container1 = new Container<>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();

        Container<String, Integer> container2 = new Container<>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int value = container2.getValue();
    }
}
