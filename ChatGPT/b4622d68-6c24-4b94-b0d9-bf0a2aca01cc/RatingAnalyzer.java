import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class RatingAnalyzer {

    public static void main(String[] args) {
        String file = "ratings.txt";
        int[] ratings = new int[5];
        int[] counts = new int[5];

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine(); // Read and ignore the header line
            line = reader.readLine();

            while (line != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                int index = 0;

                while (tokenizer.hasMoreTokens()) {
                    int rating = Integer.parseInt(tokenizer.nextToken());
                    if (rating != 0) {
                        ratings[index] += rating;
                        counts[index]++;
                    }
                    index++;
                }

                line = reader.readLine();
            }

            reader.close();

            System.out.println("Average Ratings:");
            for (int i = 0; i < ratings.length; i++) {
                if (counts[i] != 0) {
                    double average = (double) ratings[i] / counts[i];
                    System.out.println("Product " + (char) ('A' + i) + ": " + average);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
