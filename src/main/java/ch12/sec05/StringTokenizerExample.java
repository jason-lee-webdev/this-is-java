package ch12.sec05;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] strArr = data1.split("&|,");
        for(String name : strArr) {
            System.out.println(name);
        }

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer stringTokenizer = new StringTokenizer(data2, "/");
        while(stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
