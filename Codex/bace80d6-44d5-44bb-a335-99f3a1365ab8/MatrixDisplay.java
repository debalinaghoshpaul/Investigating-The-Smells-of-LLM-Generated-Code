public class MatrixDisplay {
    public static void displayMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // Replace 5 with the desired size of the matrix
        displayMatrix(n);
    }
}
