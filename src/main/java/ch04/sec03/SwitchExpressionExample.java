package ch04.sec03;

// switch 문에서 Expressions 을 사용하여
// 'A' 또는 'a' 등급인 경우 "우수 회원입니다." 를 출력하고
// 'B' 또는 'b' 등급인 경우 "일반 회원입니다." 를 출력하고
// 그 외의 모든 등급의 경우 "손님입니다." 를 출력하시오.

public class SwitchExpressionExample {
    public static void main(String[] args) {
        char grade = 'a';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }

            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            // 중괄호 안에 실행문이 하나만 있을 경우에는 중괄호를 생략할 수 있다.

            default -> System.out.println("손님입니다.");
        }
    }
}
