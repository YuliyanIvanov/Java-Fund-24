package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class A06_Foreign_Languages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        switch (country) {
            case "England":
            case "USA":
                System.out.print("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.print("Spanish");
                break;
            default:
                System.out.print("unknown");
                break;
        }
    }
}
