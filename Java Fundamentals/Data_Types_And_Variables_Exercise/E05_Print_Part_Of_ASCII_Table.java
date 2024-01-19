package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class E05_Print_Part_Of_ASCII_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startSymbol = Integer.parseInt(scanner.nextLine());
        int endSymbol = Integer.parseInt(scanner.nextLine());

        for (int i = startSymbol; i <= endSymbol; i++) {
            System.out.printf("%c ", (char) i);
        }
    }
}
