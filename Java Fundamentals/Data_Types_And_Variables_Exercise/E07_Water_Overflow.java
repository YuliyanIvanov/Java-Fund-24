package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class E07_Water_Overflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int totalLiters = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            totalLiters += liters;

            if (totalLiters > 255) {
                System.out.println("Insufficient capacity!");
                totalLiters -= liters;
            }
        }
        System.out.println(totalLiters);
    }
}
