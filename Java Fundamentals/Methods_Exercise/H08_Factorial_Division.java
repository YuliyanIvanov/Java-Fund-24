package Methods_Exercise;

import java.util.Scanner;

public class H08_Factorial_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        double firstFactorial = calculateFactorial(firstNum);
        double secondFactorial = calculateFactorial(secondNum);

        double result = firstFactorial / secondFactorial;

        System.out.printf("%.2f", result);
    }

    private static double calculateFactorial(int num) {
        double factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
