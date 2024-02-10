package Methods_Lab;

import java.util.Scanner;

public class G08_Math_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = calculatePower(number, power);
        System.out.printf("%.0f", result);

        scanner.close();
    }

    public static double calculatePower(double number, int power) {
        return Math.pow(number, power);
    }
}
