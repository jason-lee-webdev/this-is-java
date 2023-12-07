package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC")
                // offset 위치에 "ABC" 를 삽입한다.

                .delete(3, 4)
                // start index 부터 end index 이전 까지의 문자를 삭제한다.

                .toString();

        System.out.println(data);
    }
}
