import java.util.HashSet;

public class CommonElementsArray {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "orange", "kiwi"};
        String[] array2 = {"banana", "kiwi", "grapes", "mango"};

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        for (String s : array1) {
            set1.add(s);
        }
        for (String s : array2) {
            set2.add(s);
        }

        set1.retainAll(set2);

        System.out.println("Common elements between array1 and array2 are :");
        for (String commonElement : set1) {
            System.out.println(commonElement);
        }
    }
}
