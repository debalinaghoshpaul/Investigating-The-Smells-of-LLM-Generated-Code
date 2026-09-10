import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        // Read the boy names file into an array
        String[] boyNames = readNamesFromFile("boynames.txt");

        // Read the girl names file into an array
        String[] girlNames = readNamesFromFile("girlnames.txt");

        // Get the name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        // Search for the name in the boy names array
        int boyRank = searchName(boyNames, name);
        if (boyRank != -1) {
            System.out.println(name + " is ranked " + boyRank + " in popularity among boys with " + boyNames[boyRank - 1] + " namings.");
        } else {
            System.out.println(name + " is not ranked among the top 1000 boy names.");
        }

        // Search for the name in the girl names array
        int girlRank = searchName(girlNames, name);
        if (girlRank != -1) {
            System.out.println(name + " is ranked " + girlRank + " in popularity among girls with " + girlNames[girlRank - 1] + " namings.");
        } else {
            System.out.println(name + " is not ranked among the top 1000 girl names.");
        }
    }

    private static String[] readNamesFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            String[] names = new String[1000];
            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                names[i] = parts[0];
                i++;
            }
            scanner.close();
            return names;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return new String[0];
        }
    }

    private static int searchName(String[] names, String target) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                return i + 1;
            }
        }
        return -1;
    }
}
