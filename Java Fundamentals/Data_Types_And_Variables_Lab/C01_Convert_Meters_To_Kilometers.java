package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class C01_Convert_Meters_To_Kilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double kilometers = meters / 1000.0;

        System.out.printf("%.2f", kilometers);
    }
}
