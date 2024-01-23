package ch13.problem.p4;

public class Util {

    public static <K, V> V getValue1(Pair<K, V> pair, K key) {
        if(!pair.getKey().equals(key)) {
            return null;
        }

        return pair.getValue();
    }

    public static <P extends Pair<K, V>, K, V> V getValue2(P pair, K key) {
        if(!pair.getKey().equals(key)) {
            return null;
        }

        return pair.getValue();
    }
    // 제네릭 메소드를 선언할 때 사용할 모든 타입 파라미터를 리턴 타입 앞에 작성한다.
    // 제한된 타입 파라미터로 제네릭 타입을 작성할 경우 제네릭 타입 뒤에 모든 타입 파라미터를 작성한다.
 }
