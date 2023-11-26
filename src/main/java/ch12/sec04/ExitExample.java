package ch12.sec04;

public class ExitExample {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                System.out.println("프로세스 강제 종료");
                System.exit(1);
                // exit() 메소드의 인자로 0 이 아닌 값을 작성하면
                // Process finished with non-zero exit value 에러 메세지가 출력된다.

            }

            System.out.println(i);
        }


    }
}
