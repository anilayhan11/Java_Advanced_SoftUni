package U3_SetsAndMapsAdvanced.L1_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P05_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputRows = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < inputRows; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            Double grade = Double.parseDouble(tokens[1]);

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        for (var entry : students.entrySet()) {
            String k = entry.getKey();
            List<Double> v = entry.getValue();

            //Turn List<Double> into a String with all grades per student, divided with space, for printing.
            String allGrades = v.stream()
                    .map(g -> String.format("%.2f", g))
                    .collect(Collectors.joining(" "));

            //Calculate the average grade of each student, regardless the number of grades, for printing.
            double average = v.stream().mapToDouble(g -> g).sum() / v.size();

            System.out.printf("%s -> %s (avg: %.2f)\n", k, allGrades, average);
        }
    }
}
