package ch12.sec11.exam01;

// Class 클래스를 사용하여 Car 클래스의 패키지명, 클래스의 간단한 이름, 클래스 전체 이름을 얻고 출력한다.

public class CarClassExample {
    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;
//        Class clazz = Class.forName("ch12.sec11.exam01.Car");
//        Car car = new Car();
//        Class clazz = car.getClass();

        System.out.println("패키지 : " + clazz.getPackage()); // package ch12.sec11.exam01
        System.out.println("패키지 : " + clazz.getPackage().getName()); // ch12.sec11.exam01
        System.out.println("패키지 : " + clazz.getPackageName()); // ch12.sec11.exam01

        System.out.println("클래스의 간단한 이름 : " + clazz.getSimpleName());

        System.out.println("클래스 전체 이름 : " + clazz.getName());
    }
}
