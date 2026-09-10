public class RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle
        int number = 7; // Number to repeat in each row

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
