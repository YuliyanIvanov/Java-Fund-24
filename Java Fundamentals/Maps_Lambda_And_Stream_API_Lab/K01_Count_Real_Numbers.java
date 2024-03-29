package Maps_Lambda_And_Stream_API_Lab;

import java.util.Scanner;
import java.util.TreeMap;

public class K01_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (String number : numbers) {
            double num = Double.parseDouble(number);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (double num : counts.keySet()) {
            System.out.printf("%.0f -> %d\n", num, counts.get(num));
        }
    }
}