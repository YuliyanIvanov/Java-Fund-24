package Methods_Lab;

import java.util.Scanner;

public class G07_Repeat_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        String repeatedText = repeatText(text, repeatCount);
        System.out.println(repeatedText);
    }

    public static String repeatText(String text, int repeatCount) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
