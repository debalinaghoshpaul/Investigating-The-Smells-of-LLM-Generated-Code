public class NumberTrianglePattern {
    public static void main(String[] args) {
        int n = 5; // number of rows in the pattern
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
