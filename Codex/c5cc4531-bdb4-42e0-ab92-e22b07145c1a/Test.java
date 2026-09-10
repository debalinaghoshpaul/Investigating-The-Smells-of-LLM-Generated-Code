public class Test {
    public static void main(String[] args) {
        double number = 3.14; // Replace with your desired number

        double nextPositiveInfinity = Math.nextUp(number);
        double nextNegativeInfinity = Math.nextDown(number);

        System.out.println("Next positive infinity: " + nextPositiveInfinity);
        System.out.println("Next negative infinity: " + nextNegativeInfinity);
    }
}
