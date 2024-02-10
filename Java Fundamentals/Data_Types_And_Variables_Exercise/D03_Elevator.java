package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class D03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        if (people <= capacity) {
            System.out.println(1);
        } else if (people % capacity == 0) {
            int a = people / capacity;
            System.out.println(a);
        } else if (people % capacity != 0) {
            int b = people / capacity;
            System.out.println(b + 1);
        }
    }
}
