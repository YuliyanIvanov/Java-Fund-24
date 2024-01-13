package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class B04_Print_And_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int number = firstNumber; number <= lastNumber; number++) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.printf("\nSum: %s", sum);
    }
}
