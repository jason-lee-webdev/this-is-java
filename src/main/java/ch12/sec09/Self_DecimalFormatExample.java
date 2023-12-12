package ch12.sec09;

// DecimalFormat 클래스를 사용하여 실수 1234567.84 를
// "+1,234,567.8" 과 "-1,234,567.8" 형식으로 출력한다.

import java.text.DecimalFormat;

public class Self_DecimalFormatExample {
    public static void main(String[] args) {
        double number = 1234567.84;

        DecimalFormat decimalFormat = new DecimalFormat("+#,###.#");
        System.out.println(decimalFormat.format(number));

        decimalFormat = new DecimalFormat("-#,###.#");
        System.out.println(decimalFormat.format(number));
        // 소수 첫째 짜리 까지 반올림 후 부호를 변환한다.
    }
}
