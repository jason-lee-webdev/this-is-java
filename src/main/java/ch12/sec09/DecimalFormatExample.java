package ch12.sec09;

// DecimalFormat 클래스를 사용하여 실수 1234567.89 를
// "1,234,568" 과 "1,234,567.9" 형식으로 출력한다.

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double number = 1234567.89;

        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        System.out.println(decimalFormat.format(number));

        decimalFormat = new DecimalFormat("#,###.#");
        System.out.println(decimalFormat.format(number));
    }
}
