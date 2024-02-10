package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class C06_Chars_To_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        char char3 = scanner.nextLine().charAt(0);

        //String result = "" + char1 + char2 + char3;
        //System.out.println(result);

        System.out.printf("%s%s%s", char1, char2, char3);

        scanner.close();
    }
}
