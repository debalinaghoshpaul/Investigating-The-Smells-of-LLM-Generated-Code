import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateAndSort {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of lowercase letters: ");
        String input = scanner.nextLine();
        
        String result = removeDuplicatesAndSort(input);
        
        System.out.println("Result after removing duplicates and arranging in lexicographical order: ");
        System.out.println(result);
        
        scanner.close();
    }
    
    public static String removeDuplicatesAndSort(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        
        Set<Character> set = new LinkedHashSet<>();
        for(char c : chars) {
            set.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for(Character c : set) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}