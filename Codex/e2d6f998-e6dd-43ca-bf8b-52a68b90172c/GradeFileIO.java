import java.io.*;

public class GradeFileIO {
    public static void main(String[] args) {
        double[] grades = new double[8];

        // Read grades from user
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = readGrade();
        }

        // Write grades to binary file
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("grades.bin"))) {
            for (double grade : grades) {
                outputStream.writeDouble(grade);
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read grades from binary file and find highest and lowest grades
        double highestGrade = Double.MIN_VALUE;
        double lowestGrade = Double.MAX_VALUE;

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("grades.bin"))) {
            while (inputStream.available() > 0) {
                double grade = inputStream.readDouble();
                highestGrade = Math.max(highestGrade, grade);
                lowestGrade = Math.min(lowestGrade, grade);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        // Output highest and lowest grades
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
    }

    private static double readGrade() {
        double grade;
        do {
            grade = Double.parseDouble(System.console().readLine());
            if (grade < 0 || grade > 10) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 10.");
            }
        } while (grade < 0 || grade > 10);
        return grade;
    }
}
