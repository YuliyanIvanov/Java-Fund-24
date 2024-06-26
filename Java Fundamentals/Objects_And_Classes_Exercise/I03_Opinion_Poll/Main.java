package Objects_And_Classes_Exercise.I03_Opinion_Poll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);

            Person person = new Person(name, age);
            if (age > 30) {
                people.add(person);
            }
        }

        for (Person person : people) {
            System.out.printf("%s - %d\n", person.getName(), person.getAge());
        }
    }
}
