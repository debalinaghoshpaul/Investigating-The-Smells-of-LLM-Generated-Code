public class Main {
    public static void main(String[] args) {
        int num = 12345; // Replace with your desired integer

        // Convert the integer to binary representation
        String binary = Integer.toBinaryString(num);

        // Find the length of the longest sequence of zeros
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }

        System.out.println("Length of the longest sequence of zeros: " + maxLength);
    }
}
