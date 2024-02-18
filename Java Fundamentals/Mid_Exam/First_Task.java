package Mid_Exam;

import java.util.Scanner;

public class First_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerDay = Double.parseDouble(scanner.nextLine());

        double totalWater = days * players * waterPerDay;
        double totalFood = days * players * foodPerDay;

        for (int i = 1; i <= days; i++) {
            double energyLost = Double.parseDouble(scanner.nextLine());
            energy -= energyLost;

            if (energy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",
                        totalFood, totalWater);
                return;
            }
            if (i % 2 == 0) {
                energy *= 1.05;
                totalWater -= totalWater * 0.30;
            }
            if (i % 3 == 0) {
                totalFood -= totalFood / players;
                energy *= 1.10;
            }
        }
        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",
                energy);
    }
}