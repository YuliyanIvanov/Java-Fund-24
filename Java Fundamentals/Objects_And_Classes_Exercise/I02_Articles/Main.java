package Objects_And_Classes_Exercise.I02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleInfo = scanner.nextLine().split(", ");
        Article article = new Article(articleInfo[0],
                articleInfo[1],
                articleInfo[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] parts = command.split(": ");
            String action = parts[0];
            String parameter = parts[1];

            switch (action) {
                case "Edit":
                    article.edit(parameter);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(parameter);
                    break;
                case "Rename":
                    article.rename(parameter);
                    break;
                default:
                    break;
            }
        }

        System.out.println(article);

        scanner.close();
    }
}
