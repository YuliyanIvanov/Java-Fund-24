package Arrays_Exercise;

import java.util.Scanner;

public class F04_Array_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");

        int[] array = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        int rotations = scanner.nextInt();

        int[] rotatedArray = rotateArray(array, rotations);

        printArray(rotatedArray);

        scanner.close();
    }

    private static int[] rotateArray(int[] array, int rotations) {
        int n = array.length;
        rotations = rotations % n;

        int[] rotatedArray = new int[n];

        System.arraycopy(array, rotations, rotatedArray, 0, n - rotations);

        System.arraycopy(array, 0, rotatedArray, n - rotations, rotations);

        return rotatedArray;
    }

    private static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
