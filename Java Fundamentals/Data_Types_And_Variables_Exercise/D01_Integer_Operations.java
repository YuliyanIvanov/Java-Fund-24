package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class D01_Integer_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberTree = Integer.parseInt(scanner.nextLine());
        int numberFour = Integer.parseInt(scanner.nextLine());

        int formula = ((numberOne + numberTwo) / numberTree) * numberFour;

        System.out.println(formula);
    }
}
