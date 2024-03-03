package Maps_LambdaA_nd_Stream_API_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L01_Count_Chars_In_A_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        String input = scanner.nextLine();

        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (charCount.containsKey(symbol)) {
                int count = charCount.get(symbol);
                charCount.put(symbol, count + 1);
            } else {
                charCount.put(symbol, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
