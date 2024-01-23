package ch13.sec05;

public class GenericExample {

    public static void main(String[] args) {
        // 모든 사람이 신청 가능
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        // 학생만 신청 가능
        // Course.registerCourse2(new Applicant<Person>(new Person()));
        // Course.registerCourse2(new Applicant<Worker>(new Worker()));
        // 필요한 매개변수의 타입과 제공한 매개변수의 타입이 달라 에러갈 발생한다.

        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        // 직장인 및 일반인 신청 가능
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        // Course.registerCourse3(new Applicant<Student>(new Student()));
        // Student 는 Person 의 자식이라 new Student() instanceof Person 의 결과는 true 이지만
        // <? super Worker> 를 매개변수의 타입으로 작성하면 매개변수에 Student 객체를 대입할 수 없다.
        // <? super Worker> 은 Worker 타입과 Worker 타입의 부모 타입인 Person 타입만이 대체 타입으로 허용된다.

        // Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
        // Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
        // 필요한 매개변수의 타입과 제공한 매개변수의 타입이 달라 에러갈 발생한다.
    }
}
