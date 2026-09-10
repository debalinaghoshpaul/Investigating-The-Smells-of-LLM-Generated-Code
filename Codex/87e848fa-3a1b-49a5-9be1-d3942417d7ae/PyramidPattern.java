public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces in decreasing order
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print numbers in increasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println(); // Move to the next line
        }
    }
}
