package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class D11_Refactor_Volume_Of_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());

        double volume = calculatePyramidVolume(length, width, height);

        System.out.printf("Pyramid Volume: %.2f", volume);

        scanner.close();
    }

    private static double calculatePyramidVolume(double length, double width, double height) {
        return (length * width * height) / 3;
    }
}
