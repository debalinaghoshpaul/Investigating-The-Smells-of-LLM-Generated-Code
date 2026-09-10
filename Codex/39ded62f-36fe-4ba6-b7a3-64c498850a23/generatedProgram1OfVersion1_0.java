public class FactorsOfThree {
    public static void displayFactorsOfThree(int num) {
        System.out.print("Factors of 3 in " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number = 27; // Change this to the desired number
        displayFactorsOfThree(number);
    }
}