import java.util.Scanner;

class MaxConsecutiveZeros {

    public static int findMaxConsecutiveZeros(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;
        int maxCount = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
            num = num / 2;
        }

        maxCount = Math.max(maxCount, count);

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();

        int maxConsecutiveZeros = findMaxConsecutiveZeros(num);

        System.out.println("The length of the longest sequence of zeros in binary representation of " + num + " is: " + maxConsecutiveZeros);
    }
}

