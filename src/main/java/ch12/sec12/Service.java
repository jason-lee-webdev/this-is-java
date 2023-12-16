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

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Service {

//    @PrintAnnotation
//    public static void print(String content) throws NoSuchMethodException {
//        Class clazz = Service.class;
//        System.out.println(clazz.isAnnotationPresent(PrintAnnotation.class)); //false
//
//        Method method = Service.class.getDeclaredMethod("print", String.class);
//        System.out.println(method.isAnnotationPresent(PrintAnnotation.class));//true
//        // ?? Class 객체를 사용하지 않고 Method 객체를 얻는 방법은 존재하지 않는가? ??
//    }

    // 어노테이션의 적용 대상이 METHOD 이므로 메소드 선언 시 어노테이션을 작성한다.
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
