package ch12.sec04;

import java.io.IOException;

public class InExample {
    public static void main(String[] args) {

        int speed = 0;
        int number = 0;

        while (true) {
            System.out.println("-------------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------------");
            System.out.println("현재 속도=" + speed);
            System.out.print("선택: ");

            try {
                number = System.in.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            number = number - 48;

            if(number == 3) {
                break;
            }

            speed = number == 1 ? ++speed : --speed;

            System.out.println();
        }

        System.out.println("프로그램 종료");
    }
}
