package Maps_LambdaA_nd_Stream_API_Exercise;

import java.util.*;

public class L05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] tokens =  input.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            courses.putIfAbsent(courseName,  new ArrayList<>());
            courses.get(courseName).add(studentName);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {

            String courseName = entry.getKey();
            List<String> studentNames = entry.getValue();

            System.out.printf("%s: %d\n", courseName, studentNames.size());
            studentNames.forEach(name -> System.out.printf("-- %s\n", name));
        }
    }
}
