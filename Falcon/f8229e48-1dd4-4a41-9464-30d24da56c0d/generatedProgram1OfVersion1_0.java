import java.util.ArrayList;
import java.util.List;

public class DivideString {
    public static void main(String[] args) {
        String str = "Hello World";
        int n = 3;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(str.substring(i * n, (i + 1) * n));
        }
        System.out.println("The programming language you need to use is: java.");
        System.out.println("Can you also add test cases including corner cases to test the program of the problem?");
        System.out.println(list);
    }
}

