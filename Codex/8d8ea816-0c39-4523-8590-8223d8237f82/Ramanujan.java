import java.util.HashMap;
import java.util.Map;

public class Ramanujan {

    public static void main(String[] args) {
        int n = 100000;
        Map<Integer, Integer> cubes = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            cubes.put(i * i * i, i);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                // Check if the sum of two cubes can be expressed in two different ways.
                int sum = i * i * i + j * j * j;
                if (cubes.containsKey(sum)) {
                    int k = cubes.get(sum);
                    if (k != i && k != j) {
                        System.out.println(sum + " = " + i + "^3 + " + j + "^3 = " + k + "^3 + " + (n - k) + "^3");
                    }
                }
            }
        }
    }
}
