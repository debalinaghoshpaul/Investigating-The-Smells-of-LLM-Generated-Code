import java.util.Scanner;

public class ClassroomExerciseGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String[] exercises = {"Group Project", "Homework", "Presentation"};
        int[] scores = new int[3];
        int[] totalPoints = new int[3];

        // Input scores for each exercise
        for (int i = 0; i < exercises.length; i++) {
            System.out.println("Name of exercise " + (i + 1) + ":");
            System.out.println(exercises[i]);
            System.out.println("Score received for exercise " + (i + 1) + ":");
            scores[i] = scanner.nextInt();
            System.out.println("Total points possible for exercise " + (i + 1) + ":");
            totalPoints[i] = scanner.nextInt();
        }

        System.out.println("\nExercise\t\tScore\tTotal Possible");
        int totalScore = 0;
        int totalPossible = 0;

        // Display scores for each exercise
        for (int i = 0; i < exercises.length; i++) {
            System.out.println(exercises[i] + "\t" + scores[i] + "\t" + totalPoints[i]);
            totalScore += scores[i];
            totalPossible += totalPoints[i];
        }

        System.out.println("Total\t\t" + totalScore + "\t" + totalPossible);

        double percentage = ((double) totalScore / totalPossible) * 100;
        System.out.println("Your total is " + totalScore + " out of " + totalPossible + ", or " + df.format(percentage) + "%.");

    }
}