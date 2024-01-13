package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class B06_Strong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumber = scanner.nextLine();
        int sumOfFactorials = 0;

        for (int position = 0; position <= inputNumber.length() - 1; position++) {
            int digit = Integer.parseInt(inputNumber.charAt(position) + "");
            int factorial = 1;
            for (int i = 2; i <= digit; i++) {
                factorial *= i;
            }
            sumOfFactorials += factorial;
        }
        int number = Integer.parseInt(inputNumber);
        if (number == sumOfFactorials) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}