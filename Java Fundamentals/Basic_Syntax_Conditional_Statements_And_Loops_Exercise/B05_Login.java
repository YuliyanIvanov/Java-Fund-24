package Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class B05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--) {

            password += username.charAt(position);
        }

        int incorrectPasswordCount = 0;

        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(password)) {

            incorrectPasswordCount++;
            if (incorrectPasswordCount == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}
