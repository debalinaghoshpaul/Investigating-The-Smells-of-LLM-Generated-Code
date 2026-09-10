public class CubeCalculator {
    public static void main(String[] args) {
        int numTerms = 4; // Input number of terms
        for (int i = 1; i <= numTerms; i++) {
            int cube = i * i * i; // Calculate the cube
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
        }
    }
}
