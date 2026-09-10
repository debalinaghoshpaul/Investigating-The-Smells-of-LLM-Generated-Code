
public class IntegerToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input an integer from the user
        System.out.print("Input an integer: ");
        int num = input.nextInt();

        // Convert the integer to String format
        String numStr = String.valueOf(num);

        // Print the String format of the integer
        System.out.println("String format of the said integer: " + numStr);
    }
}
