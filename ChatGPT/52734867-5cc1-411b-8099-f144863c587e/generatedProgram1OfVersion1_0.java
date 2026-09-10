import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Who painted the Mona Lisa?",
            "What is the largest mammal on Earth?",
            "What is the boiling point of water in Celsius?",
            "Who wrote Romeo and Juliet?"
        };

        String[] answers = {
            "Paris",
            "Leonardo da Vinci",
            "Blue whale",
            "100",
            "William Shakespeare"
        };

        int[] pointValues = {2, 3, 3, 1, 2};

        Scanner scanner = new Scanner(System.in);

        int totalScore = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct! You've won " + pointValues[i] + " points.\n");
                totalScore += pointValues[i];
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i] + "\n");
            }
        }

        System.out.println("Game over! Your total score is: " + totalScore);

        scanner.close();
    }
}
