import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {
    public static List<String> findMatchingFiles(String directory, String fileName) {
        List<String> matchingFiles = new ArrayList<>();
        File dir = new File(directory);
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    matchingFiles.addAll(findMatchingFiles(file.getAbsolutePath(), fileName));
                } else if (file.getName().equals(fileName)) {
                    matchingFiles.add(file.getAbsolutePath());
                }
            }
        }

        return matchingFiles;
    }

    public static void main(String[] args) {
        String directory = "path/to/directory";
        String fileName = "file.txt";

        List<String> matchingFiles = findMatchingFiles(directory, fileName);

        if (matchingFiles.isEmpty()) {
            System.out.println("No matching files found.");
        } else {
            System.out.println("Matching files:");
            for (String file : matchingFiles) {
                System.out.println(file);
            }
        }
    }
}