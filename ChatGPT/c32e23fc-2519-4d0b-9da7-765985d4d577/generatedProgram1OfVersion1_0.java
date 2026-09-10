import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class BabyNamePopularityRanking {

    private static final int YEARS = 10;
    private static final String[] YEARS_STR = {"2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"};
    private static final String MALE = "boy";
    private static final String FEMALE = "girl";
    private static final String DATA_FILE_NAME = "babynamesranking.txt";

    private static Map<String, Integer>[] boyNames;
    private static Map<String, Integer>[] girlNames;

    public static void main(String[] args) {
        // Load data
        loadData();

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year (e.g., 2001): ");
        String year = scanner.nextLine();
        System.out.println("Enter a gender (boy/girl): ");
        String gender = scanner.nextLine();
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();

        // Find ranking
        int ranking = findRanking(year, gender, name);

        // Display ranking
        if (ranking == -1) {
            System.out.println("Name not found.");
        } else {
            System.out.println("Ranking: " + ranking);
        }
    }

    private static void loadData() {
        try {
            // Create arrays for boy's and girl's names
            boyNames = new Map[YEARS];
            girlNames = new Map[YEARS];

            // Load data from file
            File file = new File(DATA_FILE_NAME);
            FileInputStream inputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(inputStream);

            // Read each line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                // Get year, gender, name, and ranking
                String year = parts[0];
                String gender = parts[1];
                String name = parts[2];
                int ranking = Integer.parseInt(parts[3]);

                // Add to appropriate array
                if (gender.equals(MALE)) {
                    if (boyNames[Integer.parseInt(year) - 2001] == null) {
                        boyNames[Integer.parseInt(year) - 2001] = new HashMap<>();
                    }
                    boyNames[Integer.parseInt(year) - 2001].put(name, ranking);
                } else if (gender.equals(FEMALE)) {
                    if (girlNames[Integer.parseInt(year) - 2001] == null) {
                        girlNames[Integer.parseInt(year) - 2001] = new HashMap<>();
                    }
                    girlNames[Integer.parseInt(year) - 2001].put(name, ranking);
                }
            }

            // Close scanner
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findRanking(String year, String gender, String name) {
        // Check if year is valid
        int yearIndex = Arrays.asList(YEARS_STR).indexOf(year);
        if (yearIndex == -1) {
            return -1;
        }

        // Check if gender is valid
        if (!gender.equals(MALE) && !gender.equals(FEMALE)) {
            return -1;
        }

        // Check if name is valid
        Map<String, Integer> names = gender.equals(MALE) ? boyNames[yearIndex] : girlNames[yearIndex];
        if (names == null || !names.containsKey(name)) {
            return -1;
        }

        // Return ranking
        return names.get(name);
    }

    public static List<String> generateTestCases() {
        List<String> testCases = new ArrayList<>();
        // Valid test cases
        testCases.add("2001,boy,Michael");
        testCases.add("2002,girl,Emma");
        testCases.add("2003,boy,Jacob");
        testCases.add("2004,girl,Isabella");
        testCases.add("2005,boy,Ethan");
        testCases.add("2006,girl,Sophia");
        testCases.add("2007,boy,Matthew");
        testCases.add("2008,girl,Olivia");
        testCases.add("2009,boy,Daniel");
        testCases.add("2010,girl,Mia");

        // Invalid test cases
        testCases.add("2011,boy,Michael"); // Invalid year
        testCases.add("2002,boy,Mary"); // Invalid gender
        testCases.add("2003,boy,John"); // Name not found

        return testCases;
    }
}
