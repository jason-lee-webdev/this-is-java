package ch12.sec08;

// Calendar 클래스와 TimeZone 클래스를 사용하여, 로스엔젤레스의 현재 시간을
// "오전 | 오후 x시 x분 x초" 형식으로 출력하시오.

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(timeZone);

        int amPm = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        String strAmPm = switch (amPm) {
            case Calendar.AM -> "오전";
            default -> "오후";
        };

        System.out.println(strAmPm + " " + hour + "시 " + minute + "분 " + second + "초");
    }
}
