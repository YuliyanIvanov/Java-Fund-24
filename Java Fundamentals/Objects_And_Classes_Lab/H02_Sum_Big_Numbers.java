package Objects_And_Classes_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class H02_Sum_Big_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondNum = new BigInteger(scanner.nextLine());

        BigInteger sum = firstNum.add(secondNum);

        System.out.println(sum);
    }
}
