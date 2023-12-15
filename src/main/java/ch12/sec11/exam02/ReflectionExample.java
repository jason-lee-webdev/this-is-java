package ch12.sec11.exam02;

// Class 클래스를 사용하여 Car 클래스의 생성자 정보, 필드 정보, 메소드 정보를 얻고 출력한다.

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = Car.class;

        printInfo(clazz.getDeclaredConstructors());
        printInfo(clazz.getDeclaredFields());
        printInfo(clazz.getDeclaredMethods());
    }

    private static void printInfo(Object object) {
        if(object instanceof Constructor[] constructors) {
            System.out.println("[생성자 정보]");

            for(Constructor constructor : constructors) {
                System.out.println(constructor.toGenericString());
            }

            return;
        }

        if(object instanceof Field[] fields) {
            System.out.println("[필드 정보]");

            for(Field field : fields) {
                System.out.println(field.toGenericString());
            }

            return;
        }

        if(object instanceof Field[] fields) {
            System.out.println("[필드 정보]");

            for(Field field : fields) {
                System.out.println(field.toGenericString());
            }

            return;
        }

        if(object instanceof Method[] methods) {
            System.out.println("[메소드 정보]");

            for(Method method : methods) {
                System.out.println(method.toGenericString());
            }
        }
    }
}
