package Methods_Lab;

import java.util.Scanner;

public class G10_Multiply_Evens_By_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int result = getMultipleOfEvensAndOdds(number);
        System.out.println(result);

        scanner.close();
    }

    public static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);
        return evenSum * oddSum;
    }

    public static int getSumOfEvenDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int getSumOfOddDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
