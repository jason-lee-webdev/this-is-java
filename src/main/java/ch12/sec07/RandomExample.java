package ch12.sec07;

import java.util.*;

//사용자로부터 로또 번호(1 ~ 45) 6개를 입력받고 Random 클래스를 사용하여 당첨 번호를 생성한다.
//사용자가 맞춘 숫자의 갯수를 출력한다.

public class RandomExample {
    public static void main(String[] args) {
        Set<Integer> winningNumbers = randomIntCreator(6, 1, 45);

        Scanner scanner = new Scanner(System.in);
        Set<Integer> inputNumbers = new HashSet<>();

        for(int i = 0; i < 6; i++) {
            System.out.print("번호를 입력하세요 : ");
            int inputNumber = scanner.nextInt();

            if(inputNumbers.contains(inputNumber)) {
                System.out.println("이미 입력한 번호 입니다. 다시 입력하세요.");
                i--;
                continue;
            }

            inputNumbers.add(inputNumber);
        }

        System.out.println("선택번호: " + inputNumbers);
        System.out.println("당첨번호 : " + winningNumbers);

        int result = lottoChecker(winningNumbers, inputNumbers);

        System.out.println("당첨여부 : 당신은 " + result + "개 일치합니다.");
    }

    public static int lottoChecker(Set<Integer> winningNumbers, Set<Integer> customerNumbers) {
        int matchedCount = 0;

        Iterator<Integer> iterator = customerNumbers.iterator();
        // HashSet 의 요소를 순회하려고 Iterator 를 사용했다.

        while(iterator.hasNext()) {
            if(winningNumbers.contains(iterator.next())) {
                matchedCount++;
            }
        }

        return matchedCount;
    }

    public static Set<Integer> randomIntCreator(int amount, int min, int max) {
        HashSet<Integer> winningNumbers = new HashSet<>();
        Random random = new Random();
        int gap = max - min + 1;

        while (true) {
            winningNumbers.add(random.nextInt(gap) + min);

            if (winningNumbers.size() == amount) {
                break;
            }
        }

        return winningNumbers;
    }
}
