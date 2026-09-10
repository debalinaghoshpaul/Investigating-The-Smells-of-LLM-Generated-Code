import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("PrimeNumbers.dat");
        BufferedReader br = new BufferedReader(fr);
        String line;
        List<Integer> primeNumbers = new ArrayList<>();
        while ((line = br.readLine())!= null) {
            int num = Integer.parseInt(line);
            if (primeNumbers.contains(num)) {
                System.out.println(num);
            } else {
                primeNumbers.add(num);
            }
        }
        br.close();
        fr.close();
    }
}

// 