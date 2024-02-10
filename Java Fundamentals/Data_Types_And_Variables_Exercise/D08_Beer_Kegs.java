package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class D08_Beer_Kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String biggestModelKeg = "";

        for (int keg = 1; keg <= numberOfKegs; keg++) {
            String model = scanner.nextLine();

            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                biggestModelKeg = model;
            }
        }
        System.out.println(biggestModelKeg);
    }
}
