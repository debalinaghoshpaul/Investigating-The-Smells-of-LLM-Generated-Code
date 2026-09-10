import java.util.Arrays;

public class PrimeMatrix {
    
    public static void main(String[] args) {
        int m = 5; // size of the 2D array
        boolean[][] matrix = createPrimeMatrix(m);
        
        // Print the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
    
    public static boolean[][] createPrimeMatrix(int m) {
        boolean[][] matrix = new boolean[m][m];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = isPrime(i) || isPrime(j);
            }
        }
        
        return matrix;
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
