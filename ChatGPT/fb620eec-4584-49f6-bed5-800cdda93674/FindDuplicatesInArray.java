import java.util.HashMap;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 6, 7, 8, 1};

        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, count + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println("Duplicates in the array are: ");
        for (int num : map.keySet()) {
            if (map.get(num) > 1) {
                System.out.println(num);
            }
        }
    }
}
