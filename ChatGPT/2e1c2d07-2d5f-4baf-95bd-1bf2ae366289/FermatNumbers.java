import java.math.BigInteger;

public class FermatNumbers {

    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {
            BigInteger fermatNumber = BigInteger.ONE.shiftLeft(n).add(BigInteger.ONE);
            System.out.println(fermatNumber);
        }
    }
}
