import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + " ";
        }
        System.out.println(reversedString);
    }
}
