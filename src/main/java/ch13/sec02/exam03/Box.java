package ch13.sec02.exam03;

public class Box<T> {
    public T content;

    //Box 의 내용물이 같은지 비교
    public boolean compare(Box<T> other) {
        // 클래스명<타입 파라미터> 를 하나의 타입처럼 인식한다.

        //Object 의 equals() 메소드로 content 필드값 비교
        return content.equals(other.content);
        //타입 파라미터를 사용한 필드는 Object 의 메소드를 호출할 수 있다.
    }
}
