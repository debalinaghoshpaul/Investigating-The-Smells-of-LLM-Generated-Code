import java.util.regex.*;
public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String str = "This#string%contains^non-alphanumeric$characters";
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);

        //Test cases

        //1. Empty string
        str = "";
        result = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);

        //2. String with only non-alphanumeric characters
        str = "#$%^&*()_+";
        result = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);

        //3. String with special characters at the beginning and end
        str = "!@#$This string contains non-alphanumeric characters%^&*()_+!";
        result = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);

        //4. String with all non-alphanumeric characters
        str = "123";
        result = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);
    }
}
