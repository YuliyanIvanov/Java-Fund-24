package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class A04_Back_In_30_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int total = hours * 60 + minutes + 30;
        hours = total / 60;
        minutes = total % 60;

        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
