public class Main {
    public static void main(String[] args) {
        double number = 3.14159;
        
        // Get the whole part
        int wholePart = (int) number;
        
        // Get the fractional part
        double fractionalPart = number - wholePart;
        
        System.out.println("Whole part: " + wholePart);
        System.out.println("Fractional part: " + fractionalPart);
    }
}