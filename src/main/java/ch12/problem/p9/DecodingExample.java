package ch12.problem.p9;

import java.io.UnsupportedEncodingException;

public class DecodingExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {-20, -107, -120, -21, -123, -107};
        String str = new String(bytes);
        System.out.println("str: " + str); //안녕
    }
}
