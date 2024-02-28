package Maps_Lambda_And_Stream_API_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class K04_Word_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
