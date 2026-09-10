import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class AdditionQuiz2 {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);

    // Create a set to store the answers
    Set<Integer> answers = new HashSet<>();

    Scanner input = new Scanner(System.in);
    System.out.print(
      "What is " + number1 + " + " + number2 + "? ");
    int answer = input.nextInt();

    // Keep asking for input until the answer is correct
    while (answer != number1 + number2) {
      System.out.print("Wrong answer. Try again. What is " +
        number1 + " + " + number2 + "? ");
      answer = input.nextInt();
    }

    // Add the correct answer to the set
    answers.add(answer);

    // Generate a new question
    number1 = (int)(Math.random() * 10);
    number2 = (int)(Math.random() * 10);

    System.out.print(
      "What is " + number1 + " + " + number2 + "? ");
    answer = input.nextInt();

    // Keep asking for input until the answer is correct
    while (answer != number1 + number2) {
      System.out.print("Wrong answer. Try again. What is " +
        number1 + " + " + number2 + "? ");
      answer = input.nextInt();
    }

    // Add the correct answer to the set
    answers.add(answer);

    // Print the set of answers
    System.out.println("The answers are: " + answers);
  }
}
