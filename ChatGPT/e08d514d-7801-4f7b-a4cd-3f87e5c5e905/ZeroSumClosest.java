
public class ZeroSumClosest {

    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};

        findClosestToZero(arr);
    }

    private static void findClosestToZero(int[] arr) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int closestSum = Integer.MAX_VALUE;
        int element1 = 0;
        int element2 = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                element1 = arr[left];
                element2 = arr[right];
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Closest to zero elements: " + element1 + " " + element2);
    }
}
