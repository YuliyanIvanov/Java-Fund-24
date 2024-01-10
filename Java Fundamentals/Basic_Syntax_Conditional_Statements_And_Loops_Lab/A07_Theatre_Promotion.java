package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class A07_Theatre_Promotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (day) {
            case "Weekday":
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                }
                break;
            case "Weekend":
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                }
                break;
            default:
                break;
        }
        if (price != 0) {
            System.out.printf("%.0f$", price);
        } else {
            System.out.println("Error!");
        }
    }
}
