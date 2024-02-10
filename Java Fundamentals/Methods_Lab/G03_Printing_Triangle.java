package Methods_Lab;

import java.util.Scanner;

public class G03_Printing_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            printLine(i);
            System.out.println();
        }

        for (int i = number - 1; i >= 1; i--) {
            printLine(i);
            System.out.println();
        }

        scanner.close();
    }

    private static void printLine(int end) {
        for (int i = 1; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
