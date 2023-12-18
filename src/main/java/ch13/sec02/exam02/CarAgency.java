package ch13.sec02.exam02;

//인터페이스를 제네릭 타입으로 선언하고 구현체를 선언할 때 타입 파라미터에 구체적인 타입을 작성한다.
public class CarAgency implements Rentable<Car> {

    @Override
    public Car rent() {
        return new Car();
    }
}
