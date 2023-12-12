package ch12.sec08;

// Date 클래스를 사용하여, 현재 시간을 문자열로 출력한다.
// Date 클래스와 SimpleDateFormat 클래스를 사용하여, 현재시간을 '년.월.일 시:분:초' 형식으로 출력한다.

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.println(sdf.format(now));
    }
}
