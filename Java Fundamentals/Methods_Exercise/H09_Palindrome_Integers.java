package Methods_Exercise;

import java.util.Scanner;

public class H09_Palindrome_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("END")) {
                break;
            }

            int number = Integer.parseInt(input);
            boolean isPalindrome = isPalindrome(number);

            System.out.println(isPalindrome ? "true" : "false");
        }
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return original == reverse;
    }
}
