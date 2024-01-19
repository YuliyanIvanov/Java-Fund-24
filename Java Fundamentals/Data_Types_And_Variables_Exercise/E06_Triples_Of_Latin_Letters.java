package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class E06_Triples_Of_Latin_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0 && number <= 26) {
            for (char first = 'a'; first < 'a' + number;
                 first++) {
                for (char second = 'a'; second < 'a' + number;
                     second++) {
                    for (char third = 'a'; third < 'a' + number;
                         third++) {
                        System.out.printf("%c%c%c\n",
                                first, second, third);
                    }
                }
            }
        }
    }
}