public class Main {
    public static void main(String[] args) {
        double number = 10.5; // Replace with your desired number

        if (isInteger(number)) {
            System.out.println(number + " is an integer.");
        } else {
            System.out.println(number + " is not an integer.");
        }
    }

    public static boolean isInteger(double number) {
        return number == (int) number;
    }
}
