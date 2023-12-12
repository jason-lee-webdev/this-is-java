package ch12.sec08;

// Calendar 클래스를 사용하여 현재 날짜와 시간을
// "xxxx년 xx월 xx일"
// "x요일 오전 | 오후"
// "x시 x분 x초" 형식으로 출력한다.

import java.util.Calendar;

public class Book_CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        int amPm = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        String strWeek = switch (week) {
            case Calendar.SUNDAY -> "일";
            case Calendar.MONDAY -> "월";
            case Calendar.TUESDAY -> "화";
            case Calendar.WEDNESDAY -> "수";
            case Calendar.THURSDAY -> "목";
            case Calendar.FRIDAY -> "금";
            default -> "토";
        };

        String strAmPm = switch (amPm) {
            case Calendar.AM -> "오전";
            default -> "오후";
        };

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(strWeek + "요일 " + strAmPm);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}
