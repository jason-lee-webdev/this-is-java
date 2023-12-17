package ch12.problem.p17;

//알파벳으로 시작하고 두 번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 ID 값인지 검사
//알파벳은 대소문자 모두 허용

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "^[a-zA-Z]{1}[a-zA-Z0-9]{7,11}$";
        boolean isMath = Pattern.matches(regExp, id);
        if(isMath) {
            System.out.println("ID 로 사용할 수 있습니다.");
        } else {
            System.out.println("ID 로 사용할 수 없습니다.");
        }
    }
}
