package ch12.sec03.exam02;

public class Student {

    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.no + this.name.hashCode();
        // Object 의 hashCode() 메소드를 재정의해서 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴하도록 한다.
        // 번호와 이름이 같으면 동일한 해시코드가 생성된다.
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Student) {
            Student other = (Student) object;

            if(this.no == other.getNo() && this.name.equals(other.getName())) {
                return true;
            }
        }

        return false;
    }
    // Object 의 equals() 메소드를 재정의해서 Student 객체인지를 확인하고,
    // 학생 번호와 이름이 같으면 true 를 리턴하도록 한다.
}
