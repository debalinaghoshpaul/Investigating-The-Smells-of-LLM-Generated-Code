import java.util.Arrays;

public class Combinations {

    public static void main(String[] args) {
        int n = 4000;
        int[] combinations = new int[n + 1];
        Arrays.fill(combinations, 0);
        combinations[0] = 1;
        for (int i = 1; i <= 1000; i++) {
            for (int j = i; j <= n; j++) {
                combinations[j] += combinations[j - i];
            }
        }
        System.out.println("The number of combinations for n = " + n + " is: " + combinations[n]);
    }
}
