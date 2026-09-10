import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductRatingCalculator {

    public static void main(String[] args) {
        String csvFile = "product_ratings.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            // Read the header line to get the product names and count
            line = br.readLine();
            String[] products = line.split(cvsSplitBy);
            int numProducts = products.length;

            // Create a 2D array to store the ratings for each product
            double[][] ratings = new double[numProducts][];
            for (int i = 0; i < numProducts; i++) {
                ratings[i] = new double[5]; // Assuming 5 ratings per product
            }

            // Read the CSV file and populate the ratings array
            int row = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                for (int i = 0; i < numProducts; i++) {
                    ratings[i][row] = Double.parseDouble(data[i]);
                }
                row++;
            }

            // Calculate and print the average rating for each product
            for (int i = 0; i < numProducts; i++) {
                double sum = 0;
                for (double rating : ratings[i]) {
                    sum += rating;
                }
                double avgRating = sum / ratings[i].length;
                System.out.println("Average rating for " + products[i] + ": " + avgRating);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
