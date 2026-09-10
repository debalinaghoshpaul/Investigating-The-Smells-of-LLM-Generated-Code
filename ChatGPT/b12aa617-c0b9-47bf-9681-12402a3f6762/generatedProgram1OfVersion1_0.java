import java.util.Scanner;

class StudentRecord {
    private int quiz1, quiz2, quiz3, midterm, finalExam;
    private double overallNumericScore;
    private char finalLetterGrade;

    // Constructor
    public StudentRecord(int quiz1, int quiz2, int quiz3, int midterm, int finalExam) {
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.midterm = midterm;
        this.finalExam = finalExam;
        computeOverallNumericGrade();
        computeFinalLetterGrade();
    }

    // Accessor methods
    public double getOverallNumericScore() {
        return overallNumericScore;
    }

    public char getFinalLetterGrade() {
        return finalLetterGrade;
    }

    // Calculate overall numeric grade based on grading policy
    private void computeOverallNumericGrade() {
        double quizPercentage = ((quiz1 + quiz2 + quiz3) / 30.0) * 25;
        double midtermPercentage = (midterm / 100.0) * 35;
        double finalPercentage = (finalExam / 100.0) * 40;

        overallNumericScore = quizPercentage + midtermPercentage + finalPercentage;
    }

    // Determine final letter grade based on overall numeric score
    private void computeFinalLetterGrade() {
        if (overallNumericScore >= 90) {
            finalLetterGrade = 'A';
        } else if (overallNumericScore >= 80) {
            finalLetterGrade = 'B';
        } else if (overallNumericScore >= 70) {
            finalLetterGrade = 'C';
        } else if (overallNumericScore >= 60) {
            finalLetterGrade = 'D';
        } else {
            finalLetterGrade = 'F';
        }
    }

    public String toString() {
        return "Quiz Scores: " + quiz1 + ", " + quiz2 + ", " + quiz3 + "\n" +
               "Midterm Exam: " + midterm + "\n" +
               "Final Exam: " + finalExam + "\n" +
               "Overall Numeric Score: " + overallNumericScore + "\n" +
               "Final Letter Grade: " + finalLetterGrade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three quiz scores (out of 10):");
        int quiz1 = scanner.nextInt();
        int quiz2 = scanner.nextInt();
        int quiz3 = scanner.nextInt();

        System.out.println("Enter midterm exam score (out of 100):");
        int midterm = scanner.nextInt();

        System.out.println("Enter final exam score (out of 100):");
        int finalExam = scanner.nextInt();

        StudentRecord student = new StudentRecord(quiz1, quiz2, quiz3, midterm, finalExam);

        System.out.println("\nStudent's Record:\n" + student.toString());
    }
}
