package Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02_Change_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] initialInput = scanner.nextLine().split("\\s+");
        for (String strNum : initialInput) {
            numbers.add(Integer.parseInt(strNum));
        }

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Delete":
                    int elementToDelete = Integer.parseInt(tokens[1]);
                    numbers.removeIf(num -> num == elementToDelete);
                    break;
                case "Insert":
                    int elementToInsert = Integer.parseInt(tokens[1]);
                    int position = Integer.parseInt(tokens[2]);
                    numbers.add(position, elementToInsert);
                    break;
            }

            input = scanner.nextLine();
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}