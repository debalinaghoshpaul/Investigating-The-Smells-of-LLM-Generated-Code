import java.util.Map;
import java.util.Scanner;

public class MergeArrays {

    public static void main(String[] args) {
        int[] array1 = new int[15];
        int[] array2 = new int[15];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < 15; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < 15; i++) {
            array2[i] = scanner.nextInt();
        }

        Map<Integer, Integer> mergedMap = mergeArrays(array1, array2);

        System.out.println("N Count");
        for (Map.Entry<Integer, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> mergeArrays(int[] array1, int[] array2) {
        Map<Integer, Integer> mergedMap = new HashMap<>();

        for (int num : array1) {
            mergedMap.put(num, mergedMap.getOrDefault(num, 0) + 1);
        }

        for (int num : array2) {
            mergedMap.put(num, mergedMap.getOrDefault(num, 0) + 1);
        }

        return mergedMap;
    }
}
