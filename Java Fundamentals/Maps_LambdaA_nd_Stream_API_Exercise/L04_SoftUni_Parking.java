package Maps_LambdaA_nd_Stream_API_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L04_SoftUni_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingLot = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String username = tokens[1];

            if (command.equals("register")) {
                String licensePlate = tokens[2];
                if (parkingLot.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", parkingLot.get(username));
                } else {
                    parkingLot.put(username, licensePlate);
                    System.out.printf("%s registered %s successfully%n", username, licensePlate);
                }
            } else if (command.equals("unregister")) {
                if (parkingLot.containsKey(username)) {
                    parkingLot.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                } else {
                    System.out.printf("ERROR: user %s not found%n", username);
                }
            }
        }

        parkingLot.forEach((key, value) -> System.out.printf("%s => %s\n", key, value));
    }
}