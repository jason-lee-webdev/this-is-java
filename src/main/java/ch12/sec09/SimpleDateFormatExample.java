package ch12.sec09;

// Date 클래스를 사용하여 현재 날짜와 시간을 객체화하고,
// SimpleDateFormat 클래스를 사용하여 현재 날짜와 시간을
// "xxxx-xx-xx"
// "xxxx년 xx월 xx일"
// "xxxx.xx.xx 오전|오후 xx:xx:xx"
// "오늘은 x요일"
// "올해의 x번째 날"
// "이달의 x번째 날" 형식으로 변환 후 출력한다.

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(now));

        simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(simpleDateFormat.format(now));

        simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(simpleDateFormat.format(now));

        simpleDateFormat = new SimpleDateFormat("오늘은 E요일");
        System.out.println(simpleDateFormat.format(now));

        simpleDateFormat = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(simpleDateFormat.format(now));

        simpleDateFormat = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(simpleDateFormat.format(now));
    }
}
