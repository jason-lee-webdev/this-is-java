package src.ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {

        Member member1 = new Member("jason");
        Member member2 = new Member("jason");
        Member member3 = new Member("david");

        if(member1.equals(member2)) {
            System.out.println("두 객체는 동등합니다.");
        } else {
            System.out.println("두 객체는 동등하지 않습니다.");
        }

        if(member1.equals(member3)) {
            System.out.println("두 객체는 동등합니다.");
        } else {
            System.out.println("두 객체는 동등하지 않습니다.");
        }

    }
}
