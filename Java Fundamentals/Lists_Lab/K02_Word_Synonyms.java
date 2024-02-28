package Lists_Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class K02_Word_Synonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(synonym);
        }

        for (String word : synonyms.keySet()) {
            System.out.print(word + " - ");
            System.out.println(String.join(", ", synonyms.get(word)));
        }
    }
}
