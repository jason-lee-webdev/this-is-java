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

public class PrintAnnotationExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // 유지 정책을 RUNTIME 이므로 실행 시 어노테이션의 속성값을 가져와 사용한다.
        for(Method method : Service.class.getDeclaredMethods()) {
            PrintAnnotation printAnnotation = method.getDeclaredAnnotation(PrintAnnotation.class);
            printLine(printAnnotation);

            method.invoke(new Service());

            printLine(printAnnotation);
        }
    }

    public static void printLine(PrintAnnotation printAnnotation) {

        if(printAnnotation != null) {
            StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0; i < printAnnotation.count(); i++) {
                stringBuilder.append(printAnnotation.value());
            }

            System.out.println(stringBuilder);
        }
    }
}
