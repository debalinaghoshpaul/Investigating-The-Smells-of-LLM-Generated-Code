// Importing necessary libraries
import java.util.Scanner;
import java.util.Random;

public class ChallengeResponseAuthentication {
    public static void main(String[] args) {
        // Actual PIN number
        String actualPIN = "12345";
        
        // Array to assign random numbers to digits from 0 to 9
        int[] randomNums = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            randomNums[i] = rand.nextInt(3) + 1;
        }
        
        // Displaying the PIN and corresponding random numbers
        System.out.println("PIN: 0 1 2 3 4 5 6 7 8 9");
        System.out.print("NUM: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(randomNums[i] + " ");
        }
        System.out.println();
        
        // Getting user's response
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your response: ");
        String response = scanner.nextLine();
        
        // Checking if user's response matches the actual PIN number
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < response.length(); i++) {
            char c = response.charAt(i);
            int digit = Character.getNumericValue(c);
            sb.append(randomNums[digit]);
        }
        
        if (sb.toString().equals(actualPIN)) {
            System.out.println("Authentication successful! Response matches the actual PIN number.");
        } else {
            System.out.println("Authentication failed. Response does not match the actual PIN number.");
        }
    }
}