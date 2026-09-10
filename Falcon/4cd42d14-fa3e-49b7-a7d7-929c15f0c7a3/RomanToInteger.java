import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        // Create a map to store the Roman numerals and their corresponding integer values
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        // Get the Roman numeral from the user
        String romanNumber = "MCMXCIV";

        // Convert the Roman numeral to an integer
        int integerNumber = romanToInteger(romanNumber, romanNumerals);

        // Print the result
        System.out.println("The integer equivalent of the Roman numeral " + romanNumber + " is " + integerNumber);
    }

    public static int romanToInteger(String romanNumber, Map<Character, Integer> romanNumerals) {
        // Initialize the integer equivalent of the Roman numeral to 0
        int integerNumber = 0;

        // Iterate over the Roman numeral from right to left
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            // Get the current Roman numeral character
            char currentRomanNumeral = romanNumber.charAt(i);

            // Get the integer equivalent of the current Roman numeral
            int currentIntegerNumber = romanNumerals.get(currentRomanNumeral);

            // If the current Roman numeral is less than the previous Roman numeral, then subtract the current integer number from the integer equivalent of the Roman numeral
            if (i > 0 && currentIntegerNumber < romanNumerals.get(romanNumber.charAt(i - 1))) {
                integerNumber -= currentIntegerNumber;
            } else {
                // Otherwise, add the current integer number to the integer equivalent of the Roman numeral
                integerNumber += currentIntegerNumber;
            }
        }

        // Return the integer equivalent of the Roman numeral
        return integerNumber;
    }
}
