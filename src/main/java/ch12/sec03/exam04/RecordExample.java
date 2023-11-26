package ch12.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {

        Member member1 = new Member("winter", "윈터", 21);
        System.out.println(member1.id());
        System.out.println(member1.name());
        System.out.println(member1.age());
        System.out.println(member1.toString());
        System.out.println();

        System.out.println("member1.hashCode() : " + member1.hashCode());

        Member member2 = new Member("winter", "윈터", 21);
        System.out.println("member2.hashCode() : " + member2.hashCode());
        System.out.println("member1.equals(member2) : " + member1.equals(member2));

        Member member3 = new Member("winter", "윈터", 41);
        System.out.println("member3.hashCode() : " + member3.hashCode());
        System.out.println("member1.equals(member3) : " + member1.equals(member3));
    }
}
