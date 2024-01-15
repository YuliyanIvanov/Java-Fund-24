package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class B08_Triangle_Of_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        //редове
        for (int row = 1; row <= num; row++) {
            //числла на ред
            for (int number = 1; number <= row; number++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
