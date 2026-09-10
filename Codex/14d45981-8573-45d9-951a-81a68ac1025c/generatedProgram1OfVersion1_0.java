import java.io.File;
import java.util.ArrayList;

public class FileSearch {
    public static ArrayList<String> findMatchingFiles(String directory, String targetFileName) {
        ArrayList<String> matchingFiles = new ArrayList<>();
        File dir = new File(directory);

        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        matchingFiles.addAll(findMatchingFiles(file.getAbsolutePath(), targetFileName));
                    } else if (file.getName().equals(targetFileName)) {
                        matchingFiles.add(file.getAbsolutePath());
                    }
                }
            }
        }

        if (matchingFiles.isEmpty()) {
            return null;
        } else {
            return matchingFiles;
        }
    }

    public static void main(String[] args) {
        String directory = "path/to/directory"; // Replace with the actual directory path
        String targetFileName = "targetFile.txt"; // Replace with the target file name

        ArrayList<String> matchingFiles = findMatchingFiles(directory, targetFileName);

        if (matchingFiles == null) {
            System.out.println("No matching files found.");
        } else {
            System.out.println("Matching files:");
            for (String filePath : matchingFiles) {
                System.out.println(filePath);
            }
        }
    }
}