package Maps_LambdaA_nd_Stream_API_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Product> products = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("buy")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int qty = Integer.parseInt(tokens[2]);

            if (!products.containsKey(name)) {
                products.put(name, new Product(price, qty));
            } else {
                Product existingProduct = products.get(name);
                existingProduct.setQuantity(existingProduct.getQuantity() + qty);
                if (existingProduct.getPrice() != price) {
                    existingProduct.setPrice(price);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            String name = entry.getKey();
            Product product = entry.getValue();
            double totalPrice = product.getPrice() * product.getQuantity();
            System.out.printf("%s -> %.2f%n", name, totalPrice);
        }
    }

    static class Product {
        private double price;
        private int qty;
        private Product(double price, int qty) {
            this.price = price;
            this.qty = qty;
        }
        private double getPrice() {
            return price;
        }
        private void setPrice(double price) {
            this.price = price;
        }
        private int getQuantity() {
            return qty;
        }
        private void setQuantity(int qty) {
            this.qty = qty;
        }
    }
}