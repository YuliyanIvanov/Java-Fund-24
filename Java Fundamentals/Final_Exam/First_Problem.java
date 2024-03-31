package Final_Exam;

import java.util.Scanner;

public class First_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String[] tokens = command.split("\\s+");
            String action = tokens[0];

            switch (action) {
                case "Replace":
                    String currentChar = tokens[1];
                    String newChar = tokens[2];
                    message = message.replace(currentChar, newChar);
                    System.out.println(message);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (isValidIndex(startIndex, message.length()) && isValidIndex(endIndex, message.length())) {
                        message = message.substring(0, startIndex) + message.substring(endIndex + 1);
                        System.out.println(message);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String letterCase = tokens[1];
                    if (letterCase.equals("Upper")) {
                        message = message.toUpperCase();
                    } else {
                        message = message.toLowerCase();
                    }
                    System.out.println(message);
                    break;
                case "Check":
                    String checkString = tokens[1];
                    if (message.contains(checkString)) {
                        System.out.println("Message contains " + checkString);
                    } else {
                        System.out.println("Message doesn't contain " + checkString);
                    }
                    break;
                case "Sum":
                    startIndex = Integer.parseInt(tokens[1]);
                    endIndex = Integer.parseInt(tokens[2]);
                    if (isValidIndex(startIndex, message.length()) && isValidIndex(endIndex, message.length())) {
                        int sum = 0;
                        for (int i = startIndex; i <= endIndex; i++) {
                            sum += message.charAt(i);
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }

            command = scanner.nextLine();
        }
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }
}