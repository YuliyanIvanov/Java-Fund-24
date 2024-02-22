package Methods_Exercise;

import java.util.Scanner;

public class H05_Add_And_Subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = sumOfTwoNumbers(firstNumber, secondNumber);
        int result = subtractTwoNumbers(sum, thirdNumber);

        System.out.println(result);
    }

    private static int sumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int subtractTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
