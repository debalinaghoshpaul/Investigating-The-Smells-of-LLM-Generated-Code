import java.util.Scanner;

public class StringToNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Convert the string to an int
        int numInt = Integer.parseInt(str);

        // Convert the string to a long
        long numLong = Long.parseLong(str);

        // Convert the string to a float
        float numFloat = Float.parseFloat(str);

        // Convert the string to a double
        double numDouble = Double.parseDouble(str);

        // Print the converted numbers
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        System.out.println("float: " + numFloat);
        System.out.println("double: " + numDouble);
    }
}
