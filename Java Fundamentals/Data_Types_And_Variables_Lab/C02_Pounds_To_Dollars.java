package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class C02_Pounds_To_Dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gpb = Double.parseDouble(scanner.nextLine());

        double usd = gpb * 1.36;

        System.out.printf("%.3f", usd);
    }
}
