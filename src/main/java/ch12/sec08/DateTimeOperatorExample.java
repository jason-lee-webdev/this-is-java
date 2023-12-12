package ch12.sec08;

// LocalDateTime 클래스를 사용하여 현재 날짜와 시간을 "현재 시간 : xxxx.xx.xx 오전|오후 xx:xx:xx" 형식으로 출력하고,
// 현재 날짜와 시간으로부터 1년을 더한 날짜와 시간을 "1년 덧셈 : xxxx.xx.xx 오전|오후 xx:xx:xx" 형식으로 출력하고,
// 현재 날짜와 시간으로부터 2월을 뺀 날짜와 시간을 "2월 뺄셈 : xxxx.xx.xx 오전|오후 xx:xx:xx" 형식으로 출력하고,
// 현재 날짜와 시간으로부터 7일을 더한 날짜와 시간을 "7일 덧셈 : xxxx.xx.xx 오전|오후 xx:xx:xx" 형식으로 출력한다.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperatorExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2023-12-12T22:22:08.587362500

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재 시간 : " + now.format(dateTimeFormatter));

        LocalDateTime plusAnYear = now.plusYears(1L);
        System.out.println("1년 덧셈 : " + plusAnYear.format(dateTimeFormatter));

        LocalDateTime minus2Months = now.minusMonths(2L);
        System.out.println("2월 뺄셈 : " + minus2Months.format(dateTimeFormatter));

        LocalDateTime plus7Days = now.plusWeeks(1L);
        System.out.println("7일 덧셈 : " + plus7Days.format(dateTimeFormatter));
    }
}
