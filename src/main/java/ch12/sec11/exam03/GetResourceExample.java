package ch12.sec11.exam03;

// Class 클래스를 사용하여 photo1.jpg 와 photo2.jpg 의 절대 경로를 얻고 출력한다.

public class GetResourceExample {
    public static void main(String[] args) {

        Class clazz = Car.class;

//        String path1 = clazz.getResource("photo1.jpg").getPath();
//        // ?? NPE 가 발생한다. 왜? ??
//        // ?? photo1.jpg 의 절대 경로를 가져오는 방법은? ??
//
//        String path2 = clazz.getResource("images/photo2.jpg").getPath();
//
//        System.out.println(path1);
//        System.out.println(path2);
    }
}
