package Methods_Lab;

import java.util.Scanner;

public class G06_Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double area = calculateArea(width, length);
        System.out.printf("%.0f", area);
    }

    public static double calculateArea(double width, double length) {
        return width * length;
    }
}
