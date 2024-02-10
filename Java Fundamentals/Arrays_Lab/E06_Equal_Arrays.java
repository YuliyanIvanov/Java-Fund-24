package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class E06_Equal_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        comparison(firstArr, secondArr);
    }

    public static void comparison(int[] firstArr, int[] secondArr) {
        boolean areIdentical = true;
        int index = -1;

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] != secondArr[i]) {
                areIdentical = false;
                index = i;
                break;
            }
        }

        if (areIdentical) {
            int sum = Arrays.stream(firstArr).sum();
            System.out.printf("Arrays are identical. Sum: %d\n", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.\n", index);
        }
    }
}
