package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class J08_Anonymous_Threat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> texts = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("3:1")) {

            if (command.contains("merge")) {

                int start = Integer.parseInt(command.split(" ")[1]);
                int end = Integer.parseInt(command.split(" ")[2]);

                if (start < 0) {
                    start = 0;
                }
                if (end > texts.size() - 1) {
                    end = texts.size() - 1;
                }

                if (start <= texts.size() - 1 && end >= 0 && end <= texts.size() - 1) {

                    StringBuilder result = new StringBuilder();
                    for (int index = start; index <= end; index++) {
                        String current = texts.get(index);
                        result.append(current);
                    }

                    if (end >= start) {
                        texts.subList(start, end + 1).clear();
                    }
                    texts.add(start, result.toString());
                }
            } else if (command.contains("divide")) {

                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= texts.size() - 1) {

                    String textToDivide = texts.get(index);
                    texts.remove(index);

                    int symbolsCount = textToDivide.length() / parts;

                    int startIndex = 0;
                    for (int part = 1; part < parts; part++) {
                        String textPerPart = textToDivide.substring(startIndex, startIndex + symbolsCount);
                        texts.add(index, textPerPart);
                        index++;
                        startIndex += symbolsCount;
                    }

                    String textLastParts = textToDivide.substring(startIndex);
                    texts.add(index, textLastParts);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", texts));
    }
}
