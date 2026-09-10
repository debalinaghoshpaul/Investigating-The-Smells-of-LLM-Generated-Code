import java.io.FileInputStream;
import java.io.IOException;
public class ReadFileToByteArray {

    public static void main(String[] args) throws IOException {
        // Read the contents of a file into a byte array
        String filePath = "./input.txt";
        FileInputStream fis = new FileInputStream(filePath);
        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);
        fis.close();

        // Print the byte array
        for (byte b : bytes) {
            System.out.println(b);
        }
    }
}
