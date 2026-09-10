public class Factors {
    public static void main(String[] args) {
        int num = 3;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

