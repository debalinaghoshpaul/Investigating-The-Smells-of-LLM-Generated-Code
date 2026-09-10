public class BowlingPins {
    public static int countPins(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + countPins(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Change this value to test with different number of rows
        int totalPins = countPins(n);
        System.out.println("Total number of pins with " + n + " rows: " + totalPins);
    }
}
