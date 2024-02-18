package Mid_Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Second_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        String[] input = scanner.nextLine().split("\\s+");
        for (String num : input) {
            numbers.add(Integer.parseInt(num));
        }

        String command;
        while (!(command = scanner.nextLine()).equals("Finish")) {
            String[] tokens = command.split("\\s+");
            String action = tokens[0];
            int value = Integer.parseInt(tokens[1]);

            switch (action) {
                case "Add":
                    numbers.add(value);
                    break;
                case "Remove":
                    int indexToRemove = numbers.indexOf(value);
                    if (indexToRemove != -1) {
                        numbers.remove(indexToRemove);
                    }
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(tokens[2]);
                    int index = numbers.indexOf(value);
                    if (index != -1) {
                        numbers.set(index, replacement);
                    }
                    break;
                case "Collapse":
                    numbers.removeIf(n -> n < value);
                    break;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}