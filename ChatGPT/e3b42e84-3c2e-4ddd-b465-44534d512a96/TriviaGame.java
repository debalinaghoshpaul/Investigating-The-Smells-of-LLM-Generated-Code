public class Trivia {
    private String question;
    private String answer;
    private int points;

    public Trivia(String question, String answer, int points) {
        this.question = question;
        this.answer = answer;
        this.points = points;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getPoints() {
        return points;
    }
}

public class TriviaGame {
    public static void main(String[] args) {
        Trivia[] triviaArray = new Trivia[5];
        
        // Populate the triviaArray with Trivia objects
        triviaArray[0] = new Trivia("What is the capital of France?", "Paris", 10);
        triviaArray[1] = new Trivia("What is the largest planet in our solar system?", "Jupiter", 10);
        triviaArray[2] = new Trivia("Which mammal can fly?", "Bat", 10);
        triviaArray[3] = new Trivia("What is the tallest mammal?", "Giraffe", 10);
        triviaArray[4] = new Trivia("What is the fastest land animal?", "Cheetah", 10);
        
        // Display the trivia questions and get user input
        for (int i = 0; i < triviaArray.length; i++) {
            System.out.println("Question " + (i+1) + ": " + triviaArray[i].getQuestion());
            // Get user input for answer (code not shown here)
        }
    }
}
