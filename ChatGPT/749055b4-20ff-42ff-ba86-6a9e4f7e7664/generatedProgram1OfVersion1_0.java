import java.util.HashSet;

public class CommonElementsInArrays {
    
    public static void main(String[] args) {
        
        String[] array1 = {"apple", "banana", "orange", "kiwi"};
        String[] array2 = {"kiwi", "pear", "orange", "grape"};
        
        HashSet<String> set = new HashSet<>();
        
        for(String value : array1) {
            set.add(value);
        }
        
        for(String value : array2) {
            if(set.contains(value)) {
                System.out.println("Common Element: " + value);
            }
        }
    }
}
