package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class D06_Equal_Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int position = 0; position <= numbers.length - 1; position++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int leftPosition = 0; leftPosition < position; leftPosition++) {
                leftSum += numbers[leftPosition];
            }

            for (int rightPosition = position + 1; rightPosition <= numbers.length - 1; rightPosition++) {
                rightSum += numbers[rightPosition];
            }

            if (leftSum == rightSum) {
                System.out.println(position);
                return;
            }
        }
        System.out.println("no");
    }
}
