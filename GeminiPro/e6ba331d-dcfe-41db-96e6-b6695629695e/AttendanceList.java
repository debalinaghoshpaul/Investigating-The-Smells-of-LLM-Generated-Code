import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AttendanceList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> students = new TreeSet<>();

        // Read the student names and attendance days
        System.out.println("Enter the student names and attendance days (enter -1 to stop): ");
        while (true) {
            String name = input.nextLine();
            if (name.equals("-1")) {
                break;
            }

            int days = input.nextInt();
            input.nextLine(); // Consume the newline character

            // Add the student to the set if they have attended more than one day
            if (days > 1) {
                students.add(name);
            }
        }

        // Display the student names in ascending order
        System.out.println("Students who have attended more than one day: ");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
