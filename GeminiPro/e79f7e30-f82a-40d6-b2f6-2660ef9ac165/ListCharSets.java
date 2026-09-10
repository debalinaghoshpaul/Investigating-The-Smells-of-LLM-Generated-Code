import java.nio.charset.Charset;
import java.util.SortedMap;

public class ListCharSets {

    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for (String csName : charsets.keySet()) {
            System.out.println(csName);
        }
    }
}
