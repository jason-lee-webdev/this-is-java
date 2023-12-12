package ch12.sec08;

// TimeZone 클래스를 사용하여 시간대 ID 를 모두 출력한다.

import java.util.TimeZone;

public class PrintTimeZoneID {
    public static void main(String[] args) {
        String[] timeZoneIDs = TimeZone.getAvailableIDs();
        for(String timeZoneID : timeZoneIDs) {
            System.out.println(timeZoneID);
        }
    }
}
