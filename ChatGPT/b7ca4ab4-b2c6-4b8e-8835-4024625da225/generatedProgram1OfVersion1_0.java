import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        Set<Integer> set = new HashSet<>();
        for(int num : array1){
            set.add(num);
        }

        Set<Integer> commonElements = new HashSet<>();
        for(int num : array2){
            if(set.contains(num)){
                commonElements.add(num);
            }
        }

        System.out.println("Common elements in the two arrays are: ");
        for(int num : commonElements){
            System.out.print(num + " ");
        }
    }
}
