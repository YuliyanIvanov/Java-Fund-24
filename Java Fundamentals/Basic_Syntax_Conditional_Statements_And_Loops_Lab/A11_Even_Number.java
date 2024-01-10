package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class A11_Even_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num % 2 == 0) {
            System.out.printf("The number is: %d", Math.abs(num));
        }

        while (num % 2 != 0) {
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.nextLine());

            if (num % 2 == 0) {
                num = Math.abs(num);
                System.out.printf("The number is: %d", num);
                break;
            }
        }
    }
}
