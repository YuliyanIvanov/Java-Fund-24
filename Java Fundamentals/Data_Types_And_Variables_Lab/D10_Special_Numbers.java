package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class D10_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            String specialStatus = getSpecialStatus(i);
            System.out.printf("%d -> %s\n", i, specialStatus);
        }

        scanner.close();
    }

    private static String getSpecialStatus(int num) {
        int sumOfDigits = 0;

        while (num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }

        return (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) ? "True" : "False";
    }
}