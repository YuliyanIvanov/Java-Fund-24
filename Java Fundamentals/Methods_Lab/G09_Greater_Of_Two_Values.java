package Methods_Lab;

import java.util.Scanner;

public class G09_Greater_Of_Two_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstInt = Integer.parseInt(scanner.nextLine());
                int secondInt = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstInt, secondInt));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
            default:
                System.out.println("Invalid input");
        }
        scanner.close();
    }

    // Method to get the maximum of two integers
    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    // Method to get the maximum of two characters
    public static char getMax(char a, char b) {
        return a > b ? a : b;
    }

    // Method to get the maximum of two strings
    public static String getMax(String a, String b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}