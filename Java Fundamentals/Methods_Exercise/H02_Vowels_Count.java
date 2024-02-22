package Methods_Exercise;

import java.util.Scanner;

public class H02_Vowels_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int count = vowelsCount(text);

        System.out.println(count);
    }

    private static int vowelsCount(String text) {
        int count = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            /*
            switch (symbol){
                 case 'a':
                     count++;
                     break;
                 case 'e':
                     count++;
                     break;
                 case 'i':
                     count++;
                     break;
                 case 'o':
                     count++;
                     break;
                 case 'u':
                     count++;
                     break;
                 default:
                     break;
             }
            */
            if (symbol == 'a' ||
                    symbol == 'e' ||
                    symbol == 'i' ||
                    symbol == 'o' ||
                    symbol == 'u') {
                count++;
            }
        }
        return count;
    }
}
