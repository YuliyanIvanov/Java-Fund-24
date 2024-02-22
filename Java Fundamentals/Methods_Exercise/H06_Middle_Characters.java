package Methods_Exercise;

import java.util.Scanner;

public class H06_Middle_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        middleCharPrint(text);
    }

    private static void middleCharPrint(String text) {
        int textLength = text.length();
        if (textLength % 2 == 0) {
            int indexOfFirstMidChar = textLength / 2 - 1;
            int indexOfSecondMidChar = textLength / 2;
            System.out.print(text.charAt(indexOfFirstMidChar));
            System.out.println(text.charAt(indexOfSecondMidChar));
        } else {
            int indexOfMidChar = textLength / 2;
            System.out.println(text.charAt(indexOfMidChar));
        }
    }
}
