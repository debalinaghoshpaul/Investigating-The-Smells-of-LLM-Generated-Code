import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input sequence of integers
        String[] inputs = scanner.nextLine().split(" ");
        int[] arr = new int[inputs.length];
        
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        
        // Find the mode values
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(num));
        }
        
        List<Integer> modeValues = new ArrayList<>();
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == maxFrequency) {
                modeValues.add(num);
            }
        }
        
        // Sort and print the mode values in ascending order
        Collections.sort(modeValues);
        for (int mode : modeValues) {
            System.out.print(mode + " ");
        }
    }
}
