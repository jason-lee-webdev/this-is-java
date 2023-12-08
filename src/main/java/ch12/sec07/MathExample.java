package ch12.sec07;

public class MathExample {
    public static void main(String[] args) {
        // 큰 정수 또는 작은 정수 얻기
        double v1 = Math.ceil(5.3);
        double v2 = Math.floor(5.3);
        System.out.println("Math.ceil(5.3) : " + v1);
        System.out.println("Math.floor(5.3) : " + v2);
        // 실수의 올림은 다른 표현으로 '같은 정수거나, 큰 정수중 가장 가까운 정수'
        // 실수의 내림은 다른 표현으로 '같은 정수거나, 작은 정수중 가장 가까운 정수'

        // 큰 값 또는 작은 값 얻기
        long v3 = Math.max(3, 7);
        long v4 = Math.min(3, 7);
        System.out.println("Math.max(3, 7) : " + v3);
        System.out.println("Math.min(3, 7) : " + v4);

        // 소수 이하 두 자리 얻기
        // 12.3456 을 12.35 로 만든다.
        double value = 12.3456;
        double tmp1 = value * 100; // 1234.56
        long tmp2 = Math.round(tmp1); // 1235.0
        // Math.round() 의 리턴타입은 int 와 long 두 타입이 있다.

        double result = tmp2 / 100.0; // 12.35
        System.out.println("result : " + result);

        // -12.3456 을 -12.35 로 만든다.
        double value2 = -12.3456;
        double tmp3 = value2 * 100; // -1234.56
        long tmp4= Math.round(tmp3); // -1235.0
        double result2 = tmp4 / 100.0; // -12.35
        System.out.println("result2 : " + result2);
    }
}
