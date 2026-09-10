import java.util.Arrays;

public class BooleanArrayToString {

    public static void main(String[] args) {
        // Sample array
        boolean[][] array = {{true, false, true}, {false, true, false}};

        // Convert the array to a string representation
        String arrayString = Arrays.deepToString(array)
                .replace("true", "t")
                .replace("false", "f");

        // Print the string representation
        System.out.println(arrayString);
    }
}
