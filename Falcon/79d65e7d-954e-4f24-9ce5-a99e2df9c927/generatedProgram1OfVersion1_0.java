import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem22 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("PrimeNumbers.dat"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("PrimeNumbers.dat"));
        List<Integer> primeNumbers = new ArrayList<>();
        String line;
        while ((line = br.readLine())!= null) {
            int num = Integer.parseInt(line);
            if (primeNumbers.contains(num)) {
                bw.write(num + "\n");
            } else {
                primeNumbers.add(num);
                bw.write(num + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

// 