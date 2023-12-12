package ch12.sec08;

// LocalDateTime 클래스를 사용하여 2021년 1월 1일을 "시작일 : xxxx.xx.xx 오전|오후 xx:xx:xx" 형식으로 출력하고,
// 2021년 12월 31일을 "시작일 : xxxx.xx.xx 오전|오후 xx:xx:xx" 형식으로 출력하고,
// 시작일이 종료일보다 이전인 경우 "진행 중입니다." 를 출력하고, 시작일과 종료일이 동일할 경우 "종료 중입니다." 를 출력하고, 시작일이 종료일보다 이후일 경우 "종료했습니다." 를 출력하고,
// 시작일부터 종료일까지의 남은 날짜와 시간을 "남은 해 : x"
// "남은 월 : x"
// "남은 일 : x"
// "남은 시간 : x"
// "남은 분 : x"
// "남은 초 : x" 형식으로 출력한다.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        LocalDateTime startDate = LocalDateTime.of(2021, 1, 1, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2021, 12, 31, 0, 0);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        System.out.println("시작일 : " + startDate.format(dateTimeFormatter));
        System.out.println("종료일 : " + endDate.format(dateTimeFormatter));

        String message = "";
        if(startDate.isBefore(endDate)) {
            message = "진행 중입니다.";
        } else if(startDate.equals(endDate)) {
            message = "종료 중입니다.";
        } else if(startDate.isAfter(endDate)) {
            message = "종료했습니다.";
        }
        System.out.println(message);

        long yearDiffernece = startDate.until(endDate, ChronoUnit.YEARS);
        long monthDifference = startDate.until(endDate, ChronoUnit.MONTHS);
        long dayDiffernece = startDate.until(endDate, ChronoUnit.DAYS);
        long hourDifference = startDate.until(endDate, ChronoUnit.HOURS);
        long minuteDifference = startDate.until(endDate, ChronoUnit.MINUTES);
        long secondDiffernece = startDate.until(endDate, ChronoUnit.SECONDS);
        System.out.println("남은 해 : " + yearDiffernece);
        System.out.println("남은 월 : " + monthDifference);
        System.out.println("남은 일 : " + dayDiffernece);
        System.out.println("남은 시간 : " + hourDifference);
        System.out.println("남은 분 : " + minuteDifference);
        System.out.println("남은 초 : " + secondDiffernece);
    }
}
