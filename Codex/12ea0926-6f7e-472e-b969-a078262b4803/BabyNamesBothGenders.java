import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BabyNamesBothGenders {

    public static void main(String[] args) throws FileNotFoundException {
        // Prompt the user to enter a file name
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name for baby name ranking: ");
        String fileName = input.nextLine();

        // Open the file
        File file = new File(fileName);
        Scanner fileInput = new Scanner(file);

        // Create two sets to store names for each gender
        Set<String> maleNames = new HashSet<>();
        Set<String> femaleNames = new HashSet<>();

        // Read the file and add names to the sets
        while (fileInput.hasNext()) {
            String line = fileInput.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            String gender = parts[1];
            if (gender.equals("M")) {
                maleNames.add(name);
            } else if (gender.equals("F")) {
                femaleNames.add(name);
            }
        }

        // Find the names that are used for both genders
        Set<String> bothGenders = new HashSet<>(maleNames);
        bothGenders.retainAll(femaleNames);

        // Display the names that are used for both genders
        System.out.println(bothGenders.size() + " names used for both genders");
        System.out.println("They are " + bothGenders);
    }
}
