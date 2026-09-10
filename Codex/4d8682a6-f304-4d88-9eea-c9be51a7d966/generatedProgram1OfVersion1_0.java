import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String str = "abcpop";
        System.out.println(str.matches(".*pop.*"));
    }
}
