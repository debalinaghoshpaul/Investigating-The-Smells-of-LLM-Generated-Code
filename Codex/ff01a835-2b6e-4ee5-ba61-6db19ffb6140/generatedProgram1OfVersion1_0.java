public class PentagonalNumbers {
    public static void main(String[] args) {
        displayPentagonalNumbers(50);
    }
    
    public static void displayPentagonalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            int pentagonalNumber = i * (3 * i - 1) / 2;
            System.out.print(pentagonalNumber + " ");
            
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}