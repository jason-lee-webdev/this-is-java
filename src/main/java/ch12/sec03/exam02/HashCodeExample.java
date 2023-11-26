package ch12.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {

        Student student1 = new Student(1, "홍길동");
        Student student2 = new Student(1, "홍길동");
        Student student3 = new Student(2, "홍길동");

        if(student1.hashCode() == student2.hashCode()) {
            if(student1.equals(student2)) {
                System.out.println("두 객체는 동등합니다.");
            } else {
                System.out.println("equals() 메소드가 false 이므로 두 객체는 동등하지 않습니다.");
            }
        } else {
            System.out.println("해시 코드가 동일하지 않아 두 객체는 동등하지 않습니다.");
        }

        if(student1.hashCode() == student3.hashCode()) {
            if(student1.equals(student3)) {
                System.out.println("두 객체는 동등합니다.");
            } else {
                System.out.println("equals() 메소드가 false 이므로 두 객체는 동등하지 않습니다.");
            }
        } else {
            System.out.println("해시 코드가 동일하지 않아 두 객체는 동등하지 않습니다.");
        }
    }
}
