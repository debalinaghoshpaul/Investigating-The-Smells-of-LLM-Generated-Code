import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:/Users/debal/OneDrive/Desktop/PhD folder/text_files/numbers_two.txt";
        List<Double> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                double number = Double.parseDouble(line);
                numbers.add(number);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();

        double squaredDiffSum = 0;
        for (double number : numbers) {
            double diff = number - average;
            squaredDiffSum += diff * diff;
        }
        double variance = squaredDiffSum / numbers.size();
        double standardDeviation = Math.sqrt(variance);

        System.out.println("Average: " + average);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}