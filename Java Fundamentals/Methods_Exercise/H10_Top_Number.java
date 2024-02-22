package Methods_Exercise;

import java.util.Scanner;

public class H10_Top_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isTopNumber(int number) {
        int sumOfDigits = 0;
        boolean hasOddDigit = false;

        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;

            if (digit % 2 != 0) {
                hasOddDigit = true;
            }

            number /= 10;
        }

        return sumOfDigits % 8 == 0 && hasOddDigit;
    }
}
