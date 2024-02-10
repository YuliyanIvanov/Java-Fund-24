package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class C08_Lower_Or_Upper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputChar = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(inputChar)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(inputChar)) {
            System.out.println("lower-case");
        }

        scanner.close();
    }
}
