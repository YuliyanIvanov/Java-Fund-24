package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class J09_Pokemon_Do_not_Go {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!numbers.isEmpty()) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= numbers.size() - 1) {
                int removedElement = numbers.get(index);
                sum += removedElement;
                numbers.remove(index);
                modifyList(numbers, removedElement);
            } else if (index < 0) {
                int removedElement = numbers.get(0);
                sum += removedElement;
                int lastElement = numbers.get(numbers.size() - 1);
                numbers.set(0, lastElement);
                modifyList(numbers, removedElement);
            } else if (index > numbers.size() - 1) {
                int removedElement = numbers.get(numbers.size() - 1);
                sum += removedElement;
                int firstElement = numbers.get(0);
                numbers.set(numbers.size() - 1, firstElement);
                modifyList(numbers, removedElement);
            }
        }

        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedElement) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= removedElement) {
                numbers.set(i, numbers.get(i) + removedElement);
            } else {
                numbers.set(i, numbers.get(i) - removedElement);
            }
        }
    }
}
