import java.util.*;

public class Random_Number_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Enter 'start' to generate a random number or 'exit' to quit:");

        String command;
        while (!(command = scanner.nextLine()).equals("exit")) {
            if (command.equals("start")) {
                int randomNumber = random.nextInt(101);
                System.out.println("Random number: " + randomNumber);
            } else {
                System.out.println("Unknown command. Please enter 'start' or 'exit'.");
            }
        }

        System.out.println("Exiting the random number generator.");
    }
}
