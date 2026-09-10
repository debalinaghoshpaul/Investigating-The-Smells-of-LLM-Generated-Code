public class Main {

    public static void sortBinaryArray(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }

        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        int[] b_nums = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};

        sortBinaryArray(b_nums);

        System.out.print("After sorting: [");
        for (int i = 0; i < b_nums.length; i++) {
            System.out.print(b_nums[i]);
            if (i < b_nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
