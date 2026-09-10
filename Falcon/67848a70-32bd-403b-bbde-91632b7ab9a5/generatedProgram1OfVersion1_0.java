public class InsertWordInMiddleOfString {

    public static void main(String[] args) {
        String str = "Python";
        String word = "Tutorial";

        // Find the middle index of the string
        int middleIndex = str.length() / 2;

        // Insert the word into the string at the middle index
        String newStr = str.substring(0, middleIndex) + word + str.substring(middleIndex);

        // Print the new string
        System.out.println(newStr);
    }
}
