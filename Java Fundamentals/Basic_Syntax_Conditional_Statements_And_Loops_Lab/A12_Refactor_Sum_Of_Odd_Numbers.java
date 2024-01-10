package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class A12_Refactor_Sum_Of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int oddNumber = 2 * i - 1;
            sum += oddNumber;
            System.out.printf("%d\n", oddNumber);
        }
        System.out.printf("Sum: %d\n", sum);
    }
}
