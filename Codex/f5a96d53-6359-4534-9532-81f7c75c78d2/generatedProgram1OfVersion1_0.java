import java.util.function.Function;

public class BinaryConverter {
    public static void main(String[] args) {
        int number = 42; // Replace with your desired number
        
        Function<Integer, String> toBinary = (n) -> Integer.toBinaryString(n);
        String binary = toBinary.apply(number);
        
        System.out.println("Binary representation of " + number + " is: " + binary);
    }
}