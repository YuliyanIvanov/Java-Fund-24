package Lists_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class I03_Merging_Lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = parseInput(scanner.nextLine());
        List<Integer> list2 = parseInput(scanner.nextLine());

        // Merge lists
        List<Integer> mergedList = mergeLists(list1, list2);

        // Print merged list
        for (Integer num : mergedList) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> parseInput(String input) {
        String[] parts = input.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String part : parts) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }

    private static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int minSize = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minSize; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }

        // Add remaining elements from the longer list
        if (list1.size() > minSize) {
            mergedList.addAll(list1.subList(minSize, list1.size()));
        } else if (list2.size() > minSize) {
            mergedList.addAll(list2.subList(minSize, list2.size()));
        }

        return mergedList;
    }
}
