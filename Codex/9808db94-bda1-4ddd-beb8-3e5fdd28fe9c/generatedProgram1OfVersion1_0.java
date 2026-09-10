import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "path/to/your/file.txt"; // Replace with the actual file path
        
        List<Double> numbers = new ArrayList<>();
        double sum = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                double number = Double.parseDouble(line);
                numbers.add(number);
                sum += number;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        int count = numbers.size();
        double average = sum / count;
        
        double squaredDiffSum = 0;
        for (double number : numbers) {
            double diff = number - average;
            squaredDiffSum += diff * diff;
        }
        
        double variance = squaredDiffSum / count;
        double standardDeviation = Math.sqrt(variance);
        
        System.out.println("Average: " + average);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}