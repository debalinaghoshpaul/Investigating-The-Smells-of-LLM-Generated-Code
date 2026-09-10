import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader {
    public static void main(String[] args) {
        String filePath = "path/to/your/binary/file.bin";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;

            while (dis.available() > 0) {
                int number = dis.readInt();
                smallest = Math.min(smallest, number);
                largest = Math.max(largest, number);
            }

            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
