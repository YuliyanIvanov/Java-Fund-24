package Arrays_Lab;

import java.util.Scanner;

public class E04_Reverse_Array_Of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");

        reverseArray(inputArray);

        System.out.println(String.join(" ", inputArray));
    }

    private static void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            String temp = arr[start]; //temp - temporarily stores values
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
