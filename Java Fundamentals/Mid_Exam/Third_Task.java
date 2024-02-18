package Mid_Exam;

import java.util.*;

public class Third_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialBooks = scanner.nextLine().split("&");
        LinkedList<String> shelf = new LinkedList<>(Arrays.asList(initialBooks));

        while (true) {
            String[] tokens = scanner.nextLine().split(" \\| ");
            String command = tokens[0];

            if (command.equals("Done")) {
                break;
            }

            String book1 = tokens[1];

            switch (command) {
                case "Add Book":
                    if (!shelf.contains(book1)) {
                        shelf.addFirst(book1);
                    }
                    break;
                case "Take Book":
                    shelf.remove(book1);
                    break;
                case "Swap Books":
                    String book2 = tokens[2];
                    if (shelf.contains(book1) && shelf.contains(book2)) {
                        int index1 = shelf.indexOf(book1);
                        int index2 = shelf.indexOf(book2);
                        Collections.swap(shelf, index1, index2);
                    }
                    break;
                case "Insert Book":
                    if (!shelf.contains(book1)) {
                        shelf.addLast(book1);
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(book1);
                    if (index >= 0 && index < shelf.size()) {
                        System.out.println(shelf.get(index));
                    }
                    break;
            }
        }

        System.out.println(String.join(", ", shelf));
    }
}