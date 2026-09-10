import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirst3Lines {

    public static void main(String[] args) {
        String filePath = "test.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null && count < 3) {
                System.out.println(line);
                count++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + filePath);
        }
    }
}
