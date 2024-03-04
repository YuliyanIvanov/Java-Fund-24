package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class I01_List_Manipulation_Basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();


            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(tokens[1]);
                    int insertIndex = Integer.parseInt(tokens[2]);
                    numbers.add(insertIndex, numToInsert);
                    break;
                default:
                    break;
            }
        }
        System.out.println(numbers
                .toString()
                .replaceAll("[\\[\\],]", ""));
    }
}
