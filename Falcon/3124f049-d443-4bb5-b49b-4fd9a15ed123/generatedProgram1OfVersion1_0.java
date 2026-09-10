import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckAlternateValues {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, -2, 5, -4, 3, -6);
        boolean result = true;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}

