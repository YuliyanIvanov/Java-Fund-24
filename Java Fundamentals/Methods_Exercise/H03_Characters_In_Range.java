package Methods_Exercise;

import java.util.Scanner;

public class H03_Characters_In_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startSymbol = scanner.nextLine().charAt(0);
        char endSymbol = scanner.nextLine().charAt(0);

        charAtRange(startSymbol, endSymbol);
    }

    public static void charAtRange(char startSymbol, char endSymbol) {
        if (startSymbol < endSymbol) {
            for (int asciiValue = startSymbol + 1; asciiValue < endSymbol; asciiValue++) {
                System.out.print((char) asciiValue + " ");
            }
        } else {
            for (int asciiValue = endSymbol + 1; asciiValue < startSymbol; asciiValue++) {
                System.out.print((char) asciiValue + " ");
            }
        }
    }
}
