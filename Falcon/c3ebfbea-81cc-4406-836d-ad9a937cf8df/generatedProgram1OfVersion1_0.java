import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {45, 20, 10, 20, 30, 50, 11};

        int[] result = Arrays.stream(array1).filter(x -> Arrays.stream(array2).anyMatch(y -> x == y)).toArray();

        System.out.println(Arrays.toString(result));
    }
}

