package ch13.problem.p4;

// 다음 Util 클래스의 정적 getValue() 메소드는 첫 번째 매개값으로 Pair 타입과 하위 타입만 받고, 두 번째 매개값으로 키값을 받습니다.
// 리턴값은 키값이 일치할 경우 Pair 에 저장된 값을 리턴하고, 일치하지 않으면 null 을 리턴하도록 Util 클래스와 getValue() 제네릭 메소드를 작성해보세요.

public class UtilExample {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
    }
}
