import java.util.ArrayList;
import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        ArrayList<Trivia> triviaList = new ArrayList<>();
        triviaList.add(new Trivia("Question 1", "Answer 1"));
        triviaList.add(new Trivia("Question 2", "Answer 2"));
        triviaList.add(new Trivia("Question 3", "Answer 3"));
        // Add more trivia objects as needed

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Trivia trivia : triviaList) {
            System.out.println(trivia.getQuestion());
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(trivia.getAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("Game Over");
        System.out.println("Your score: " + score);
    }
}

class Trivia {
    private String question;
    private String answer;

    public Trivia(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
