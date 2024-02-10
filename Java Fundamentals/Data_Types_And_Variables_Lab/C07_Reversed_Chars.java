package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class C07_Reversed_Chars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        char char3 = scanner.nextLine().charAt(0);

        //String result = char3 + " " + char2 + " " + char1;
        //System.out.println(result);

        System.out.printf("%s %s %s", char3, char2, char1);

        scanner.close();
    }
}
