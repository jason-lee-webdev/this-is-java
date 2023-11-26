package ch12.sec04;

public class MeasureTimeExample {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();

        int sum = 0;

        for(int i = 1; i <= 1000000; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();
        long endNanoTime = System.nanoTime();

        System.out.println("1부터 1000000까지 합 : " + sum);
        System.out.println("프로세스에 소요된 시간 : " + (endTime - startTime) + "밀리초");
        System.out.println("프로세스에 소요된 시간 : " + (endNanoTime - startNanoTime) + "나노초");
    }
}
