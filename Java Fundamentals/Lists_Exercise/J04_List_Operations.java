package Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J04_List_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        String input = scanner.nextLine();
        String[] initialNumbers = input.split("\\s+");

        for (String num : initialNumbers) {
            numbers.add(Integer.parseInt(num));
        }

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("End")) {
                break;
            }

            String[] tokens = command.split("\\s+");
            String operation = tokens[0];

            switch (operation) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    if (indexToInsert >= 0 && indexToInsert < numbers.size()) {
                        numbers.add(indexToInsert, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    if (indexToRemove >= 0 && indexToRemove < numbers.size()) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(tokens[2]);
                    if (tokens[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            int firstElement = numbers.remove(0);
                            numbers.add(firstElement);
                        }
                    } else if (tokens[1].equals("right")) {
                        for (int i = 0; i < count; i++) {
                            int lastElement = numbers.remove
                                    (numbers.size() - 1);
                            numbers.add(0, lastElement);
                        }
                    }
                    break;
            }
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
