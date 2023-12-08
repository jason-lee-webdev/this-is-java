package ch12.sec07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

// 사용자로부터 로또 번호(1 ~ 45) 6개를 입력받고 Random 클래스를 사용하여 당첨 번호를 생성한다.
// 사용자가 6개 숫자를 모두 맞춘 경우 "1등에 당첨되었습니다." 를 출력하고
// 1개 라도 맟추지 못한 경우 "당첨되지 않았습니다." 를 출력한다.

public class RandomExample2 {
    public static void main(String[] args) {

        // 당첨 숫자를 생성할 때와 동일한 seed 값을 사용하여 Random 객체를 생성한다.
        Random random = new Random(3);
        // 결과 : Random 객체를 생성할 떄 동일한 seed 를 사용하면 동일한 시퀀스의 랜덤 숫자가 return 된다.

        // 당첨 숫자를 생성할 때와 다른 seed 값을 사용하여 Random 객체를 생성한다.
        // Random random = new Random(5);

        Integer[] inputNumbers = new Integer[6];
        for(int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = random.nextInt(45) + 1;
        }
        System.out.println("선택번호 : " + Arrays.toString(inputNumbers));

        Integer[] winningNumbers = lottoNumberCreator();
        System.out.println("당첨번호 : " +  Arrays.toString(winningNumbers));

        if(Arrays.equals(winningNumbers, inputNumbers)) {
            System.out.println("1등에 당첨되었습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }
    }

    public static int lottoChecker(Integer[] winningNumbers, Integer[] customerNumbers) {
        int matchedCount = 0;
        HashSet<Integer> hashedWinningNumbers = new HashSet<>(Arrays.asList(winningNumbers));

        for(int number : customerNumbers) {
            if(hashedWinningNumbers.contains(number)) {
                matchedCount++;
            }
        }

        return matchedCount;
    }

    public static Integer[] lottoNumberCreator() {
        Integer[] winningNumbers = new Integer[6];

        // seed 값으로 3을 작성한다.
        Random random = new Random(3);

        for(int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = random.nextInt(45) + 1;
        }

        return winningNumbers;
    }
}
