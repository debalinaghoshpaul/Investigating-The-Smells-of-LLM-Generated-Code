import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomerSimilarity {

    public static void main(String[] args) {
        int[] userRatings = new int[4];

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter ratings for the first four products:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Product " + (char)('A' + i) + ": ");
            userRatings[i] = input.nextInt();
        }

        int[] mostSimilarCustomerRatings = findMostSimilarCustomer(userRatings);

        if (mostSimilarCustomerRatings != null) {
            System.out.println("Prediction for Product E: " + mostSimilarCustomerRatings[4]);
        } else {
            System.out.println("No similar customer found.");
        }
    }

    public static int[] findMostSimilarCustomer(int[] userRatings) {
        int[] mostSimilarCustomerRatings = null;
        int minSimilarity = Integer.MAX_VALUE;

        try {
            File file = new File("customer_ratings.csv");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] ratings = line.split(",");

                int similarity = Math.abs(userRatings[0] - Integer.parseInt(ratings[0]))
                        + Math.abs(userRatings[1] - Integer.parseInt(ratings[1]))
                        + Math.abs(userRatings[2] - Integer.parseInt(ratings[2]))
                        + Math.abs(userRatings[3] - Integer.parseInt(ratings[3]));

                if (similarity < minSimilarity) {
                    minSimilarity = similarity;
                    mostSimilarCustomerRatings = new int[5];
                    for (int i = 0; i < 5; i++) {
                        mostSimilarCustomerRatings[i] = Integer.parseInt(ratings[i]);
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return mostSimilarCustomerRatings;
    }
}
