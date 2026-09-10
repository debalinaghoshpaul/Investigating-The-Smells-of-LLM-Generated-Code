
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 0, 4, 3, 6};

        boolean result = checkConsecutiveNumbers(array);
        System.out.println("Check consecutive numbers in the array: " + result);
    }

    public static boolean checkConsecutiveNumbers(int[] array) {
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                return false;
            }
        }

        return true;
    }
}
