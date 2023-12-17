package ch12.problem.p15;

//올해 12월 31일까지 몇 일이 남았는지를 구하는 코드를 작성해보세요.

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Example {
    public static void main(String[] args) {
        LocalDateTime midnightToday = LocalDateTime.now().with(LocalTime.MIDNIGHT);
        System.out.println(midnightToday); //2023-12-17T00:00

        LocalDateTime december31th = LocalDateTime.of(2023, 12, 31, 0, 0);
        System.out.println("올해 12월 31일까지 남은 일 수: " + midnightToday.until(december31th, ChronoUnit.DAYS));
    }
}
