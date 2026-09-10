import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("PrimeNumbers.dat")));
        List<Long> primeNumbers = new ArrayList<>();
        while (scanner.hasNextLong()) {
            primeNumbers.add(scanner.nextLong());
        }
        scanner.close();
        System.out.println(primeNumbers);
    }
}

