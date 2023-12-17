package ch12.problem.p12;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        //기존 코드
        System.out.println(obj1 == obj2); //true
        System.out.println(obj3 == obj4); //false
        //== 연산자는 내부의 값을 비교하는 것이 아니라 포장 객체의 번지를 비교한다.
        //따라서 내부의 값이 같더라도 서로 다른 객체일 경우 == 연산자의 결과가 false 를 리턴한다.
        //하지만 예외적으로 -128~127 사이의 값을 갖는 경우 포장 객체는 공유된다.

        //수정된 코드
        System.out.println(obj1.intValue() == obj2.intValue()); //true
        System.out.println(obj3.intValue() == obj4.intValue()); //true
    }
}
