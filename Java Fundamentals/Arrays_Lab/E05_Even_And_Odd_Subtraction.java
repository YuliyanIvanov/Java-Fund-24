package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class E05_Even_And_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(subtraction(numbers));
    }

    public static int subtraction(int[] arr) {

        int evenSum = 0;
        int oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        return evenSum - oddSum;
    }
}
