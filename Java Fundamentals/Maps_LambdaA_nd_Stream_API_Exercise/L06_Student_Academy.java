package Maps_LambdaA_nd_Stream_API_Exercise;

import java.util.*;

public class L06_Student_Academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < studentsCount; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentGrades.containsKey(studentName)) {
                studentGrades.get(studentName).add(grade);
            } else {
                studentGrades.put(studentName, new ArrayList<>());
                studentGrades.get(studentName).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            double sum = grades.stream().mapToDouble(Double::doubleValue).sum();

            double argGrade = sum / grades.size();
            if (argGrade >= 4.50) {
                System.out.printf("%s -> %.2f\n", studentName, argGrade);
            }
        }
    }
}
