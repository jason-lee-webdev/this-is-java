package ch12.problem.p10;

public class StringBuilderExample {
    public static void main(String[] args) {
        //기존 코드
//        String str = "";
//        for(int i = 0; i < 100; i++) {
//            str += i;
//        }
//        System.out.println(str);

        //개선한 코드
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 100; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
    }
}
