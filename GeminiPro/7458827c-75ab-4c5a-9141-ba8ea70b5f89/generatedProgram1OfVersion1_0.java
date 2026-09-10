import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MatrixMultiplication {

    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors();
    private static final int MATRIX_SIZE = 1000;

    public static void main(String[] args) throws InterruptedException {
        int[][] matrixA = generateMatrix(MATRIX_SIZE);
        int[][] matrixB = generateMatrix(MATRIX_SIZE);
        int[][] result = new int[MATRIX_SIZE][MATRIX_SIZE];

        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);

        // Divide the multiplication task into subtasks and assign them to threads
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                int taskRow = i;
                int taskCol = j;
                executorService.submit(() -> {
                    for (int k = 0; k < MATRIX_SIZE; k++) {
                        result[taskRow][taskCol] += matrixA[taskRow][k] * matrixB[k][taskCol];
                    }
                });
            }
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        // Print the result matrix
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }
}
