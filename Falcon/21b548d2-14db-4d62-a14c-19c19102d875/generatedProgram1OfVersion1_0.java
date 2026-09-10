import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductRatings {

    public static void main(String[] args) {
        // Read header line to get product names and number of products
        String headerLine = null;
        int numProducts = 0;
        try {
            Scanner headerScanner = new Scanner(new File("product_ratings.csv"));
            headerLine = headerScanner.nextLine();
            String[] headerFields = headerLine.split(",");
            numProducts = headerFields.length - 1;
            headerScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading header line: " + e.getMessage());
            return;
        }

        // Create 2D array to store ratings
        double[][] ratings = new double[numProducts][];
        for (int i = 0; i < numProducts; i++) {
            ratings[i] = new double[5];
        }

        // Read data from CSV file and store in 2D array
        try {
            Scanner dataScanner = new Scanner(new File("product_ratings.csv"));
            // Skip header line
            dataScanner.nextLine();
            while (dataScanner.hasNextLine()) {
                String dataLine = dataScanner.nextLine();
                String[] dataFields = dataLine.split(",");
                for (int i = 0; i < numProducts; i++) {
                    ratings[i][Integer.parseInt(dataFields[i + 1]) - 1] = Double.parseDouble(dataFields[0]);
                }
            }
            dataScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading data: " + e.getMessage());
            return;
        }

        // Calculate and output average rating for each product
        for (int i = 0; i < numProducts; i++) {
            double averageRating = 0.0;
            for (int j = 0; j < 5; j++) {
                averageRating += ratings[i][j];
            }
            averageRating /= 5.0;
            System.out.println("Average rating for product " + headerLine.split(",")[i + 1] + ": " + averageRating);
        }
    }
}
