package ch12.problem.p16;

//SimpleDateFormat 클래스를 이용해서 오늘 날짜를 다음과 같이 출력하도록 코드를 작성해보세요.

//[실행 결과]
//xxxx년 xx월 xx일 x요일 xx시 xx분

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분").format(new Date())); //2023년 12월 17일 일요일 20시 41분
    }
}
