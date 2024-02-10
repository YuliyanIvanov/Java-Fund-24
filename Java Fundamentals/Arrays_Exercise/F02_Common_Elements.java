package Arrays_Exercise;

import java.util.Scanner;

public class F02_Common_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String elementTwo : secondArr) {

            for (String elementOne : firstArr) {
                if (elementTwo.equals(elementOne)) {
                    System.out.print(elementOne + " ");
                }
            }
        }
    }
}
