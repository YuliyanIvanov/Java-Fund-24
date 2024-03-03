package Maps_LambdaA_nd_Stream_API_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L02_A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();
        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int qty = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(resource)) {
                int existingQty = resources.get(resource);
                resources.put(resource, existingQty + qty);
            } else {
                resources.put(resource, qty);
            }
            resource = scanner.nextLine();
        }
        resources.forEach((key, value) ->
                System.out.printf("%s -> %d\n", key, value));
    }
}
