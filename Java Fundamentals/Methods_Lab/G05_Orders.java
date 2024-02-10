package Methods_Lab;

import java.util.Scanner;

public class G05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int qty = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                coffee(qty);
                break;
            case "water":
                water(qty);
                break;
            case "coke":
                coke(qty);
                break;
            case "snacks":
                snacks(qty);
                break;
            default:
                break;
        }
    }

    public static void coffee(int qty) {
        double sum = qty * 1.50;
        System.out.printf("%.2f", sum);
    }

    public static void water(int qty) {
        double sum = qty * 1.00;
        System.out.printf("%.2f", sum);
    }

    public static void coke(int qty) {
        double sum = qty * 1.40;
        System.out.printf("%.2f", sum);
    }

    public static void snacks(int qty) {
        double sum = qty * 2.00;
        System.out.printf("%.2f", sum);
    }
}
