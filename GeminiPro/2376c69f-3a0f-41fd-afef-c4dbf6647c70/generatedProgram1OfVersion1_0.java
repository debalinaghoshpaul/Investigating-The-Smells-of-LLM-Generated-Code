import java.util.Arrays;

public class CatalanNumbers {

  public static void main(String[] args) {
    // Print the first 10 Catalan numbers
    int[] catalanNumbers = catalanNumbers(10);
    System.out.println(Arrays.toString(catalanNumbers));
  }

  public static int[] catalanNumbers(int n) {
    int[] catalan = new int[n + 1];

    catalan[0] = 1;
    catalan[1] = 1;

    for (int i = 2; i <= n; i++) {
      catalan[i] = 0;
      for (int j = 0; j < i; j++) {
        catalan[i] += catalan[j] * catalan[i - j - 1];
      }
    }

    return catalan;
  }
}
