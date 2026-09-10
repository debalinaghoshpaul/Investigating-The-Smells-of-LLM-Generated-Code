import java.util.*;

public class CountStudentAttendance {

    public static void main(String[] args) {
        // Create a map to store the number of courses each student attended
        Map<String, Integer> studentAttendance = new HashMap<>();

        // Read the input data
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            // Get the student's name and the number of courses they attended
            String studentName = parts[0];
            int numCourses = Integer.parseInt(parts[1]);

            // Update the student's attendance in the map
            studentAttendance.put(studentName, studentAttendance.getOrDefault(studentName, 0) + numCourses);
        }

        // Sort the students in descending order of the number of courses attended
        List<Map.Entry<String, Integer>> sortedStudents = new ArrayList<>(studentAttendance.entrySet());
        sortedStudents.sort(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        // Display the names of the students and the number of courses each student has attended
        for (Map.Entry<String, Integer> student : sortedStudents) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
