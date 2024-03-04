package Maps_LambdaA_nd_Stream_API_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L07_Legendary_Farming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean isLegendaryItemBought = false;

        while (!isLegendaryItemBought) {
            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int existingQuantity = materials.get(material);
                    materials.put(material, existingQuantity + quantity);
                } else {
                    if (junk.containsKey(material)) {
                        int existingQuantity = junk.get(material);
                        junk.put(material, existingQuantity + quantity);
                    } else {
                        junk.put(material, quantity);
                    }
                }
                for (Map.Entry<String, Integer> entry : materials.entrySet()) {

                    if (entry.getValue() >= 250) {
                        isLegendaryItemBought = true;
                        if (entry.getKey().equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (entry.getKey().equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (entry.getKey().equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        int newQuantity = entry.getValue() - 250;
                        materials.put(material, newQuantity);
                    }
                }
                if (isLegendaryItemBought) {
                    break;
                }
            }
        }
        materials.forEach((key, value) ->
                System.out.println(key + ": " + value));
        junk.forEach((key, value) ->
                System.out.println(key + ": " + value));
    }
}