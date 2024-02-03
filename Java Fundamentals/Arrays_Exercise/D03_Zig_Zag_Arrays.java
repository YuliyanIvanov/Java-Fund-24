package Arrays_Exercise;

import java.util.Scanner;

public class D03_Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        createArrays(scanner, n, firstArray, secondArray);

        printArray(firstArray);

        printArray(secondArray);

        scanner.close();
    }

    private static void createArrays(Scanner scanner, int n, String[] firstArray, String[] secondArray) {
        int position = 0;

        for (int row = 1; row <= n; row++) {
            String textRow = scanner.nextLine();
            String[] currentRowElements = textRow.split(" ");

            String firstElement = currentRowElements[0];
            String secondElement = currentRowElements[1];

            if (row % 2 != 0) {
                firstArray[position] = firstElement;
                secondArray[position] = secondElement;
            } else {
                firstArray[position] = secondElement;
                secondArray[position] = firstElement;
            }
            position++;
        }
    }

    private static void printArray(String[] arr) {
        for (String el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
