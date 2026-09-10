import java.util.ArrayList;
import java.util.Scanner;

class Dictionary {
    private String term;
    private ArrayList<String> synonyms;

    public Dictionary(String term, ArrayList<String> synonyms) {
        this.term = term;
        this.synonyms = synonyms;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public ArrayList<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(ArrayList<String> synonyms) {
        this.synonyms = synonyms;
    }
}

public class Main {
    private static ArrayList<Dictionary> database = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Add a term");
            System.out.println("2. Delete a term");
            System.out.println("3. Display all terms");
            System.out.println("4. Search for a term");
            System.out.println("5. Search for a term and delete");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addTerm();
                    break;
                case 2:
                    deleteTerm();
                    break;
                case 3:
                    displayAllTerms();
                    break;
                case 4:
                    searchForTerm();
                    break;
                case 5:
                    searchAndDeleteTerm();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTerm() {
        System.out.print("Enter the term: ");
        String term = scanner.nextLine();
        System.out.print("Enter the number of synonyms: ");
        int numSynonyms = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        ArrayList<String> synonyms = new ArrayList<>();
        for (int i = 0; i < numSynonyms; i++) {
            System.out.print("Enter synonym " + (i + 1) + ": ");
            String synonym = scanner.nextLine();
            synonyms.add(synonym);
        }

        Dictionary dictionary = new Dictionary(term, synonyms);
        database.add(dictionary);
        System.out.println("Term added successfully.");
    }

    private static void deleteTerm() {
        System.out.print("Enter the term to delete: ");
        String term = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getTerm().equalsIgnoreCase(term)) {
                database.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Term deleted successfully.");
        } else {
            System.out.println("Term not found.");
        }
    }

    private static void displayAllTerms() {
        if (database.isEmpty()) {
            System.out.println("No terms found.");
        } else {
            System.out.println("Terms:");
            for (Dictionary dictionary : database) {
                System.out.println("Term: " + dictionary.getTerm());
                System.out.println("Synonyms: " + dictionary.getSynonyms());
                System.out.println();
            }
        }
    }

    private static void searchForTerm() {
        System.out.print("Enter the search term: ");
        String searchTerm = scanner.nextLine();

        boolean found = false;
        for (Dictionary dictionary : database) {
            if (dictionary.getTerm().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println("Term: " + dictionary.getTerm());
                System.out.println("Synonyms: " + dictionary.getSynonyms());
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Term not found.");
        }
    }

    private static void searchAndDeleteTerm() {
        System.out.print("Enter the search term: ");
        String searchTerm = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getTerm().toLowerCase().contains(searchTerm.toLowerCase())) {
                database.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Term deleted successfully.");
        } else {
            System.out.println("Term not found.");
        }
    }
}
