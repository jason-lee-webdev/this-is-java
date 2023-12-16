package ch12.sec12;

// 적용 대상을 METHOD, 유지 정책을 RUNTIME 으로 하고 구분선에 대한 설정 정보를 속성을 가지고 있는 @PrintAnnotation 어노테이션을 구현한다.

// [실행 결과]
// --------------- (15)
// 실행 내용1
// --------------- (15)
// #################### (20)
// 실행 내용3
// #################### (20)
// *************** (15)
// 실행 내용2
// *************** (15)

public class Book_Service {
    @PrintAnnotation
    public void method1() {
        System.out.println("실행 내용1");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("실행 내용2");
    }

    @PrintAnnotation(value = "#", count = 20)
    public void method3() {
        System.out.println("실행 내용3");
    }
}
