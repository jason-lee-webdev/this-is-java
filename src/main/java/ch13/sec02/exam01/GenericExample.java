package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<TV, String> product1 = new Product<>();
        product1.setKind(new TV());
        product1.setModel("삼성 OLED");
        TV tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("람보르기니");
        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
