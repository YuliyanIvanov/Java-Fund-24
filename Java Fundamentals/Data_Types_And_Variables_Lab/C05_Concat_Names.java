package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class C05_Concat_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        //System.out.println(firstName + delimiter + lastName);
        System.out.printf("%s%s%s", firstName, delimiter, lastName);
    }
}
