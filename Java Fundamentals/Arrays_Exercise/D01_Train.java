package Arrays_Exercise;

import java.util.Scanner;

public class D01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] train = new int[n];

        for (int i = 0; i < n; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
        }

        printTrainAndSum(train);
    }

    public static void printTrainAndSum(int[] train) {
        int sum = 0;

        for (int j : train) {
            System.out.print(j + " ");
            sum += j;
        }

        System.out.println();
        System.out.println(sum);
    }
}
