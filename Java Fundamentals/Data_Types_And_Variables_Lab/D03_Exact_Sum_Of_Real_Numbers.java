package Data_Types_And_Variables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class D03_Exact_Sum_Of_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = BigDecimal.ZERO;

        for (int i = 0; i < numbers; i++) {
            BigDecimal number = scanner.nextBigDecimal();
            sum = sum.add(number);
        }
        System.out.println(sum);
    }
}
