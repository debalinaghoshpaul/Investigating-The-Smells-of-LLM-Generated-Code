public class Operations {

    public static void main(String[] args) {
        // Define the operations and their expected results
        int[][] operations = {
            {-5, 8, 6, 43},
            {55, 9, 9, 1},
            {20, -3, 5, 8, 19},
            {5, 15, 3, 2, 8, 3, 43, 13}
        };

        // Iterate through the operations and print the results
        for (int[] operation : operations) {
            int result = 0;
            switch (operation.length) {
                case 3:
                    result = operation[0] + operation[1] * operation[2];
                    break;
                case 4:
                    result = (operation[0] + operation[1]) % operation[2];
                    break;
                case 5:
                    result = operation[0] + operation[1] * operation[2] / operation[3];
                    break;
                case 7:
                    result = operation[0] + operation[1] / operation[2] * operation[3] - operation[4] % operation[5] : operation[6];
                    break;
            }
            System.out.println(result);
        }
    }
}
