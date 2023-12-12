package ch04.sec03;

// Switch Expression 을 사용하여, grade 에 따라 스위치된 점수를 score 변수에 대입한다.
// "A" grade 인 경우 score 변수에 100을 대입하고,
// "B" grade 인 경우 score 변수에 80을 대입하고,
// 그 외의 모든 grade 의 경우 score 변수에 60을 대입한다.
// score 변수를 출력한다.

public class SwitchValueExample {
    public static void main(String[] args) {
        char grade = 'A';

        int score = switch (grade) {
            case 'A' -> 100;
            case 'B' -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };

        System.out.println("score : " + score);
    }
}
