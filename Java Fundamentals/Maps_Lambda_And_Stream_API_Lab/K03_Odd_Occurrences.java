package Maps_Lambda_And_Stream_API_Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class K03_Odd_Occurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().toLowerCase().split(" ");

        LinkedHashMap<String, Integer> wordCounts = new LinkedHashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> oddOccurrences = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddOccurrences.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddOccurrences));
    }
}
