package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {

        SmartPhone galaxy100 = new SmartPhone("삼성", "안드로이드");
        SmartPhone iPhone100 = new SmartPhone("애플", "ios");

        System.out.println(galaxy100);
        System.out.println(iPhone100.toString());
    }
}
