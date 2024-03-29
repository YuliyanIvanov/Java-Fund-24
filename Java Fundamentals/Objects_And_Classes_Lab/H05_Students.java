package Objects_And_Classes_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H05_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        class Student {
            private String firstName;
            private String lastName;
            private int age;
            private String hometown;

            public Student(String firstName, String lastName, int age, String hometown) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
                this.hometown = hometown;
            }

            public String getHometown() {
                return hometown;
            }

            public String toString() {
                return firstName + " " + lastName + " is " + age + " years old";
            }
        }

        List<Student> students = new ArrayList<>();

        String input;
        while (!(input = scanner.nextLine()).equals("end")) {
            String[] studentData = input.split("\\s+");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String hometown = studentData[3];
            students.add(new Student(firstName, lastName, age, hometown));
        }

        String city = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(city)) {
                System.out.println(student);
            }
        }
    }
}
