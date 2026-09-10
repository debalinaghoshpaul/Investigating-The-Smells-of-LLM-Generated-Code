public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 7, 9, 2, 1};
        int[] arr2 = {5, 3, 8};

        for (int i = 0; i < arr2.length; i++) {
            int count = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] < arr2[i]) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
