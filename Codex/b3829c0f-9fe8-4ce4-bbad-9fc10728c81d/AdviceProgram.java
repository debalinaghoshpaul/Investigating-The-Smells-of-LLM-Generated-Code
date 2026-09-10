import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AdviceProgram {
    private static final String ADVICE_FILE_PATH = "C:/Users/debal/OneDrive/Desktop/PhD folder/text_files/advice.txt";

    public static void main(String[] args) {
        // Read previous advice from file
        String previousAdvice = readAdviceFromFile();

        // Display previous advice to the user
        System.out.println("Previous advice: " + previousAdvice);

        // Get new advice from the user
        String newAdvice = getUserInput();

        // Save new advice to file
        saveAdviceToFile(newAdvice);

        System.out.println("Advice saved successfully!");
    }

    private static String readAdviceFromFile() {
        StringBuilder advice = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(ADVICE_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                advice.append(line).append("\n");
            }
        } catch (IOException e) {
            // Handle file reading error
            e.printStackTrace();
        }
        return advice.toString();
    }

    private static String getUserInput() {
        StringBuilder advice = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your advice (press Enter twice to finish):");
            String line;
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                advice.append(line).append("\n");
            }
        } catch (IOException e) {
            // Handle user input error
            e.printStackTrace();
        }
        return advice.toString();
    }

    private static void saveAdviceToFile(String advice) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ADVICE_FILE_PATH))) {
            writer.write(advice);
        } catch (IOException e) {
            // Handle file writing error
            e.printStackTrace();
        }
    }
}
