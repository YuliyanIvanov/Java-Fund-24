package Lists_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class I04_List_Manipulation_Advanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseInput(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Contains":
                    int numberToCheck = Integer.parseInt(tokens[1]);
                    if (numbers.contains(numberToCheck)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")) {
                        printEvenNumbers(numbers);
                    } else {
                        printOddNumbers(numbers);
                    }
                    break;
                case "Get":
                    int sum = getSum(numbers);
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int filterNumber = Integer.parseInt(tokens[2]);
                    filterNumbers(numbers, condition, filterNumber);
                    break;
            }
            command = scanner.nextLine();
        }
    }

    private static List<Integer> parseInput(String input) {
        String[] parts = input.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printOddNumbers(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static void filterNumbers(List<Integer> numbers, String condition, int filterNumber) {
        switch (condition) {
            case ">":
                for (int num : numbers) {
                    if (num > filterNumber) {
                        System.out.print(num + " ");
                    }
                }
                break;
            case ">=":
                for (int num : numbers) {
                    if (num >= filterNumber) {
                        System.out.print(num + " ");
                    }
                }
                break;
            case "<":
                for (int num : numbers) {
                    if (num < filterNumber) {
                        System.out.print(num + " ");
                    }
                }
                break;
            case "<=":
                for (int num : numbers) {
                    if (num <= filterNumber) {
                        System.out.print(num + " ");
                    }
                }
                break;
        }
        System.out.println();
    }
}