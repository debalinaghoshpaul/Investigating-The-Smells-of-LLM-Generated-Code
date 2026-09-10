import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 5, 0, 4, 3, 6);
        boolean result = true;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)!= arr.get(i + 1)) {
                result = false;
                break;
            }
        }
        if (result)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

// 