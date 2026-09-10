import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i!= j && i!= k && j!= k) {
                        System.out.print(i + " " + j + " " + k + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}

// 