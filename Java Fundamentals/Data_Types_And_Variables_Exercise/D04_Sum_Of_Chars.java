package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class D04_Sum_Of_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChar = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int count = 1; count <= numberOfChar; count++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += symbol;
        }

        System.out.printf("The sum equals: %s", sum);
    }
}
