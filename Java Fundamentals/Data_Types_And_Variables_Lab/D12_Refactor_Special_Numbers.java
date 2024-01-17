package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class D12_Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
            int sumOfDigits = 0;
            int tempNumber = currentNumber;

            while (tempNumber > 0) {
                sumOfDigits += tempNumber % 10;
                tempNumber /= 10;
            }

            String specialStatus = (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) ? "True" : "False";

            System.out.printf("%d -> %s%n", currentNumber, specialStatus);
        }

        scanner.close();
    }
}