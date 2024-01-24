package Arrays_Lab;

import java.util.Scanner;

public class F01_Day_Of_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] daysOfTheWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        if (n >= 1 && n <= 7) {
            System.out.println(daysOfTheWeek[n - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
