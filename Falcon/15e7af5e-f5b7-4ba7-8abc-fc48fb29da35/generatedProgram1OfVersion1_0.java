import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSize {
    public static void main(String[] args) throws IOException {
        File file = new File("home/students/abc.txt");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("home/students/test.txt");
        int size = fis.available();
        fos.write(size);
        fos.close();
        fis.close();
    }
}

// 