import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatesAndSort {

    public static void main(String[] args) {
        String str = "abcabcabc";
        List<String> list = new ArrayList<>();
        list.add(str);
        Collections.sort(list);
        System.out.println(list);
    }
}

// 