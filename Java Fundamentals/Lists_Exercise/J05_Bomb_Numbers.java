package Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05_Bomb_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] inputNumbers = scanner.nextLine().split("\\s+");
        for (String num : inputNumbers) {
            numbers.add(Integer.parseInt(num));
        }

        int bombNumber = scanner.nextInt();
        int bombPower = scanner.nextInt();

        while (numbers.contains(bombNumber)) {
            int bombIndex = numbers.indexOf(bombNumber);
            int startIndex = Math.max(0, bombIndex - bombPower);
            int endIndex = Math.min(numbers.size() - 1, bombIndex + bombPower);

            if (endIndex >= startIndex) {
                numbers.subList(startIndex, endIndex + 1).clear();
            }
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println(sum);
    }
}