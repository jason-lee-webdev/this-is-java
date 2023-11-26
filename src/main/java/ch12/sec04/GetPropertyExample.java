package ch12.sec04;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {

        // 운영체제와 사용자 정보 출력
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        System.out.println(osName);
        System.out.println(userName);
        System.out.println(userHome);

        // 전체 키와 값을 출력
        System.out.println("-----------------------------------------------");
        System.out.println("key:                                      value");
        System.out.println("-----------------------------------------------");
        Properties properties = System.getProperties();
        Set keys = properties.keySet();

        for(Object objKey : keys) {
            String key = (String) objKey;
            // ?? Object 객체를 String 타입으로 형변환하면 문자열 값은 어떻게 유지되는가 ??

            String value = System.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }
    }
}
