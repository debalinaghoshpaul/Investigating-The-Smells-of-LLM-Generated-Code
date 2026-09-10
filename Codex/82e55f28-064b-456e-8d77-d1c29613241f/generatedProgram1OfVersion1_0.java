import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileStats {
    public static void main(String[] args) {
        String fileName = "path/to/your/binary/file.bin";
        
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            double sum = 0;
            double sumOfSquares = 0;
            int count = 0;
            
            while (dis.available() > 0) {
                double number = dis.readDouble();
                sum += number;
                sumOfSquares += number * number;
                count++;
            }
            
            double average = sum / count;
            double variance = (sumOfSquares / count) - (average * average);
            double standardDeviation = Math.sqrt(variance);
            
            System.out.println("Average: " + average);
            System.out.println("Standard Deviation: " + standardDeviation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}