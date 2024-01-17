package Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class D09_Centuries_To_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = scanner.nextInt();

        int yearsInCentury = 100;
        double daysInYear = 365.2422;
        int hoursInDay = 24;
        int minutesInHour = 60;

        double years = centuries * yearsInCentury;
        double days = years * daysInYear;
        double hours = days * hoursInDay;
        double minutes = hours * minutesInHour;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes%n",
                centuries, years, days, hours, minutes);

        scanner.close();
    }
}
