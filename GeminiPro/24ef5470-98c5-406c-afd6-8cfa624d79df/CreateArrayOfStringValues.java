public class CreateArrayOfStringValues {

    public static void main(String[] args) {
        int n = 5;
        String[] arr = createArrayOfStringValues(n);
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }

    private static String[] createArrayOfStringValues(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }
}
