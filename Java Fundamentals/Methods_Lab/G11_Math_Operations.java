package Methods_Lab;

import java.util.Scanner;

public class G11_Math_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int num2 = Integer.parseInt(scanner.nextLine());

        double result = calculateResult(num1, operator, num2);
        System.out.printf("%.0f%n", result);

        scanner.close();
    }

    public static double calculateResult(double num1, char operator, double num2) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
        return result;
    }
}
