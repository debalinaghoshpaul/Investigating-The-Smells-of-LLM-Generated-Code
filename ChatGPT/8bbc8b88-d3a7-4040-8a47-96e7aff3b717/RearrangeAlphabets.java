import java.util.Arrays;

public class RearrangeAlphabets {
    
    public static void main(String[] args) {
        String input = "Z3Y1X9W5V2U8T4S6";
        String rearrangedString = rearrangeAlphabets(input);
        System.out.println("Rearranged String: " + rearrangedString);
    }
    
    public static String rearrangeAlphabets(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        
        for(char c : chars) {
            if(Character.isAlphabetic(c)) {
                sb.append(c);
            } else {
                sum += Character.getNumericValue(c);
            }
        }
        
        sb.append(sum);
        return sb.toString();
    }
}
