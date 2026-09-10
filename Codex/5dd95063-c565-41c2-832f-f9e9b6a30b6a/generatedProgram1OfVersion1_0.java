public class CopilotTest {
    public static void main(String[] args) {
        String input = "350";
        System.out.println("The middle character(s) in the string: " + getMiddleCharacter(input));
    }

    public static String getMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;
        if (length % 2 == 0) {
            return str.substring(middle - 1, middle + 1);
        } else {
            return str.substring(middle, middle + 1);
        }
    }
}