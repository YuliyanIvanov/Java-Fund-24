package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class B03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        price = 8.45;
                        if (people >= 30) {
                            price = price * 0.85;
                        }
                        break;
                    case "Business":
                        price = 10.90;
                        if (people >= 100) {
                            people = people - 10;
                        }
                        break;
                    case "Regular":
                        price = 15;
                        if (people >= 10 && people <= 20) {
                            price = price * 0.95;
                        }
                        break;
                    default:
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        price = 9.80;
                        if (people >= 30) {
                            price = price * 0.85;
                        }
                        break;
                    case "Business":
                        price = 15.60;
                        if (people >= 100) {
                            people = people - 10;
                        }
                        break;
                    case "Regular":
                        price = 20;
                        if (people >= 10 && people <= 20) {
                            price = price * 0.95;
                        }
                        break;
                    default:
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        price = 10.46;
                        if (people >= 30) {
                            price = price * 0.85;
                        }
                        break;
                    case "Business":
                        price = 16;
                        if (people >= 100) {
                            people = people - 10;
                        }
                        break;
                    case "Regular":
                        price = 22.50;
                        if (people >= 10 && people <= 20) {
                            price = price * 0.95;
                        }
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
        double total = Math.abs(people * price);
        System.out.printf("Total price: %.2f", total);
    }
}
