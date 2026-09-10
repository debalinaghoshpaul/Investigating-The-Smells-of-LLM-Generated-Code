
public class AbecadarianWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();

        if (isAbecadarian(word)) {
            System.out.println("The word '" + word + "' is an Abecadarian word.");
        } else {
            System.out.println("The word '" + word + "' is not an Abecadarian word.");
        }
    }

    public static boolean isAbecadarian(String word) {
        word = word.toLowerCase();
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < word.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}