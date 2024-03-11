package Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J03_House_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < commandsCount; i++) {
            String[] commandParts = scanner.nextLine()
                    .split("\\s+");
            String name = commandParts[0];

            if (commandParts[2].equals("going!")) {
                if (guests.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guests.add(name);
                }
            } else {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}