package Arrays_Exercise;

import java.util.Scanner;

public class D05_Top_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");

        int[] array = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        findTopIntegers(array);

        scanner.close();
    }

    private static void findTopIntegers(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            boolean isTopInteger = true;

            for (int j = i + 1; j < n; j++) {
                if (array[i] <= array[j]) {
                    isTopInteger = false;
                    break;
                }
            }

            if (isTopInteger) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(array[n - 1]);
    }
}
