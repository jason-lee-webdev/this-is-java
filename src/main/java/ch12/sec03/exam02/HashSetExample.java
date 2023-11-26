package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student(1, "홍길동"));

        System.out.println("hashset 에 저장된 요소의 개수 : " + hashSet.size());

        hashSet.add(new Student(1, "홍길동"));

        System.out.println("hashset 에 저장된 요소의 개수 : " + hashSet.size());

        hashSet.add(new Student(2, "홍길동"));

        System.out.println("hashset 에 저장된 요소의 개수 : " + hashSet.size());
    }
}
