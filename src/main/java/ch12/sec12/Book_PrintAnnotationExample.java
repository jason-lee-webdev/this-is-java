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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Book_PrintAnnotationExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = Book_Service.class.getDeclaredMethods();
        for(Method method : methods) {
            //PrintAnnotation 얻기
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

            //설정 정보를 이용해서 선 출력
            printLine(printAnnotation);

            //메소드 호출
            method.invoke(new Book_Service());

            //설정 정보를 이용해서 선 출력
            printLine(printAnnotation);
        }
    }
    // ?? main 메소드를 실행할 때마다 출력 결과가 다르다. 왜 그런가? ??

    public static void printLine(PrintAnnotation printAnnotation) {
        if(printAnnotation != null) {
            //count 속성값 얻기
            int count = printAnnotation.count();
            for(int i = 0; i < count; i++) {
                //value 속성값 얻기
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
