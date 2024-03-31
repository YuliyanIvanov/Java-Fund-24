package Final_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String result = processInput(input);
            System.out.println(result);
        }
    }

    private static String processInput(String input) {
        Pattern pattern = Pattern.compile("!(?<command>[A-Z][a-z]{2,})!:\\[(?<text>[A-Za-z]{8,})]");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            String command = matcher.group("command");
            String text = matcher.group("text");

            StringBuilder resultBuilder = new StringBuilder(command + ":");
            for (char c : text.toCharArray()) {
                resultBuilder.append(" ").append((int) c);
            }

            return resultBuilder.toString();
        } else {
            return "The message is invalid";
        }
    }
}