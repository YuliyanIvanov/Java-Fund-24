package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class A03_Passed_Or_Failed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade= Double.parseDouble(scanner.nextLine());

        if (grade >= 3.00){
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
