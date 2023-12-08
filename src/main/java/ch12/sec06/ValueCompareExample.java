package ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        // -128~127 범위의 값일 경우
        Integer obj1 = 120;
        Integer obj2 = 120;
        System.out.println("obj1 == obj2 : " + (obj1 == obj2));
        System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2));

        // -128~127 범위 이외의 값일 경우
        Integer obj3 = 130;
        Integer obj4 = 130;
        System.out.println("obj3 == obj4 : " + (obj3 == obj4));
        System.out.println("obj3.equals(obj4) : " + obj3.equals(obj4));
    }
}
