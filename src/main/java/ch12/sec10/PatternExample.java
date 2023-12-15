package ch12.sec10;

// Pattern 클래스를 사용하여,
// 02-123-1234 또는 010-1234-1234 와 같은 전화번호 형식과
// white@naver.com 과 같은 이메일 형식과 입력한 문자열이 일치하는지 확인하는 코드를 작성하시오.

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String phoneNumberRegExp = "(02|010)-\\d{3,4}-\\d{4}";
        String inputPhoneNumber = "010-9876-9876";

        boolean result = Pattern.matches(phoneNumberRegExp, inputPhoneNumber);

        if(result) {
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }

        String emailRegExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        String inputEmail = "whit@enavercom";

        result = Pattern.matches(emailRegExp, inputEmail);

        if(result) {
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }
    }
}
