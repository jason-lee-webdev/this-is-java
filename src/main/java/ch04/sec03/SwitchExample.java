package ch04.sec03;

// Math 클래스를 사용하여 1부터 6사이의 숫자 중 랜덤한 숫자를 생성하고,
// switch 문을 사용하여 숫자가 1인 경우 "1번이 나왔습니다." 를, 2인 경우 "2번이 나왔습니다." 를 ... 6인 경우 "6번이 나왔습니다."를 출력한다.

public class SwitchExample {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 6) + 1;

        switch (number) {
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:
                System.out.println("6번이 나왔습니다.");
        }
    }
}
