package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class D04_Town_Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        int population = scanner.nextInt();
        int area = scanner.nextInt();

        System.out.printf("Town %s has population of %d and area %d square km.\n",
                townName, population, area);

        scanner.close();
    }
}
