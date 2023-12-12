package ch04.sec03;

// Math 클래스를 사용하여 8부터 11사이의 랜덤한 숫자를 생성하여 "[현재 시간] : x시" 형식으로 출력하고,
// break 문 없는 switch 문을 사용하여 숫자가 8일 경우 "출근합니다." "회의를 시작합니다." "업무를 봅니다." "외근을 나갑니다." 를,
// 9일 경우 "회의를 시작합니다." "업무를 봅니다." "외근을 나갑니다." 를
// 10일 경우 "업무를 봅니다." "외근을 나갑니다." 를
// 11일 경우 "외근을 나갑니다." 를 출력한다.

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int hour = (int)(Math.random() * 4) + 8;
        System.out.println("[현재 시간] : " + hour + "시");

        switch (hour) {
            case 8:
                System.out.println("출근을 합니다.");
            case 9:
                System.out.println("회의를 시작합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            case 11:
                System.out.println("외근을 나갑니다.");
        }
    }
}
