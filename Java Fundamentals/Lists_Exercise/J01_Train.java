package Lists_Exercise;

import java.util.*;

public class J01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = new ArrayList<>();
        Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .forEach(wagons::add);

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.startsWith("Add")) {
                int passengers = Integer.parseInt(input.split("\\s+")[1]);
                addWagon(wagons, passengers);
            } else {
                int passengers = Integer.parseInt(input);
                findWagon(wagons, maxCapacity, passengers);
            }
            input = scanner.nextLine();
        }

        wagons.forEach(w -> System.out.print(w + " "));
    }

    private static void addWagon(List<Integer> wagons, int passengers) {
        wagons.add(passengers);
    }

    private static void findWagon(List<Integer> wagons, int maxCapacity, int passengers) {
        for (int i = 0; i < wagons.size(); i++) {
            int availableSeats = maxCapacity - wagons.get(i);
            if (availableSeats >= passengers) {
                wagons.set(i, wagons.get(i) + passengers);
                break;
            }
        }
    }
}