package Arrays_Exercise;

import java.util.Scanner;

public class F07_Condense_Array_To_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;
        }

        System.out.println(numbers[0]);

        scanner.close();
    }
}
