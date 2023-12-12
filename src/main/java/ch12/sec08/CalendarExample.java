package ch12.sec08;

// Calendar 클래스를 사용하여 현재 날짜와 시간을
// "xxxx년 xx월 xx일"
// "x요일 오전 | 오후"
// "x시 x분 x초" 형식으로 출력한다.

import java.util.Calendar;

public class CalendarExample {
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

        System.out.println(year); // 2023
        System.out.println(month); // 12
        System.out.println(day); // 12
        System.out.println(week); // 3
        System.out.println(amPm); // 1
        System.out.println(hour); // 9
        System.out.println(minute); // 27
        System.out.println(second); // 20

        String strWeek = switch (week) {
            case 1 -> "일";
            case 2 -> "월";
            case 3 -> "화";
            case 4 -> "수";
            case 5 -> "목";
            case 6 -> "금";
            default -> "토";
        };

        String strAmPm = switch (amPm) {
            case 0 -> "오전";
            default -> "오후";
        };

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(strWeek + "요일 " + strAmPm);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}
