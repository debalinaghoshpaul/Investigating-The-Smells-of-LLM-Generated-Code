import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SentenceEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file to be edited: ");
        String sourceFileName = scanner.nextLine();

        File sourceFile = new File(sourceFileName);
        if (!sourceFile.exists()) {
            System.out.println("File not found!");
            return;
        }

        String tempFileName = generateTempFileName();
        File tempFile = new File(tempFileName);

        try {
            Scanner fileScanner = new Scanner(sourceFile);
            FileWriter fileWriter = new FileWriter(tempFile);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] sentences = line.split("\\.");

                for (String sentence : sentences) {
                    if (!sentence.trim().isEmpty()) {
                        fileWriter.write(sentence.trim() + ".\n");
                    }
                }
            }

            fileScanner.close();
            fileWriter.close();

            sourceFile.delete();
            tempFile.renameTo(sourceFile);

            System.out.println("File edited successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static String generateTempFileName() {
        String baseName = "Temp";
        int count = 1;
        String tempFileName = baseName + count;

        while (new File(tempFileName).exists()) {
            count++;
            tempFileName = baseName + count;
        }

        return tempFileName;
    }
}
