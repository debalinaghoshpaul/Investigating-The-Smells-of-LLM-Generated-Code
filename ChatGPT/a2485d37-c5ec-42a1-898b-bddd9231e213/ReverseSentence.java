
public class ReverseSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        String sentence = input.nextLine();

        String reversedSentence = reverseSentence(sentence);
        
        System.out.println("Result: " + reversedSentence);
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}
