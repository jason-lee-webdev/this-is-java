package ch12.sec06;

public class BoxingAndUnBoxingExample {
    public static void main(String[] args) {
        int value = 100;

        // boxing
        Integer boxedValue = value;
        System.out.println("boxedValue.toString() : " + boxedValue.toString());
        // toString() 는 Integer 객체의 value 필드를 문자열화 한다.

        System.out.println("boxedValue.intValue() : " + boxedValue.intValue());
        // intValue() 는 Integer 객체의 value 필드를 리턴한다.

        // unboxing
        int unboxedValue = boxedValue;
        System.out.println("boxedValue : " + unboxedValue);

        // 연산 시 unboxing
        int result = boxedValue + 50;
        System.out.println("result : " + result);
    }
}
