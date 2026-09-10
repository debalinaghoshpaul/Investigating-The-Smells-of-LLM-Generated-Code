import java.io.File;

public class GetFileSize {

    public static void main(String[] args) {
        File file = new File("test.txt");

        // Get file size in bytes
        long fileSizeInBytes = file.length();
        System.out.println("File size in bytes: " + fileSizeInBytes);

        // Get file size in KB
        double fileSizeInKB = fileSizeInBytes / 1024.0;
        System.out.println("File size in KB: " + fileSizeInKB);

        // Get file size in MB
        double fileSizeInMB = fileSizeInKB / 1024.0;
        System.out.println("File size in MB: " + fileSizeInMB);
    }
}
