package ch12.problem.p8;

public class Example {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int[] scores = new int[1000];
        for(int i = 0; i < scores.length; i++) {
            scores[i] = i;
        }

        int sum = 0;
        for(int score : scores) {
            sum += score;
        }

        double avg = sum / scores.length;
        System.out.println(avg);

        long endTime = System.nanoTime();

        System.out.println("총 소요 시간: " + (endTime - startTime) + "나노초");
//        System.out.println("총 소요 시간: " + (endTime - startTime) / 1000.0 + "마이크로초");
//        System.out.println("총 소요 시간: " + (endTime - startTime) / 1000000.0 + "밀리초");
//        System.out.println("총 소요 시간: " + (endTime - startTime) / 1000000000.0 + "초");
    }
}
