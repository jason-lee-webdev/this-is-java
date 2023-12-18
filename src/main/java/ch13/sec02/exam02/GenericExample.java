package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {

        HomeAgency homeAgency = new HomeAgency();
        Home rentedHome = homeAgency.rent();
        rentedHome.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car rentedCar = carAgency.rent();
        rentedCar.run();
    }
}
