
public class CountZeroBits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accepting input from user
        System.out.print("Input first number: ");
        int num = input.nextInt();

        // Converting the number to binary representation
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation of " + num + " is: " + binary);

        // Counting the number of zero bits
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                count++;
            }
        }

        System.out.println("Number of zero bits: " + count);

        input.close();
    }
}
