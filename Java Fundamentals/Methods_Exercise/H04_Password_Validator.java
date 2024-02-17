package Methods_Exercise;

import java.util.Scanner;

public class H04_Password_Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        boolean isValid = true;

        if (!checkLength(password)) {
            isValid = false;
        }
        if (!checkCharacters(password)) {
            isValid = false;
        }
        if (!checkDigits(password)) {
            isValid = false;
        }
        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    public static boolean checkLength(String password) {
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }

    public static boolean checkCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    public static boolean checkDigits(String password) {
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return true;
    }
}
