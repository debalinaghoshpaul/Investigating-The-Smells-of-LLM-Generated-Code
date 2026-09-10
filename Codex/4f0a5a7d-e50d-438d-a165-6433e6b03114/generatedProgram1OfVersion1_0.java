import java.util.LinkedList;
import java.util.Scanner;

public class WordLinkedList {
    private LinkedList<String> wordList;

    public WordLinkedList() {
        wordList = new LinkedList<>();
    }

    public void insertWordAtBeginning(String word) {
        wordList.addFirst(word);
    }

    public void insertWordAtPosition(String word, int position) {
        if (position >= 0 && position <= wordList.size()) {
            wordList.add(position, word);
        } else {
            System.out.println("Invalid position!");
        }
    }

    public void deleteWordFromBeginning() {
        if (!wordList.isEmpty()) {
            wordList.removeFirst();
        } else {
            System.out.println("List is empty!");
        }
    }

    public void deleteWordFromPosition(int position) {
        if (position >= 0 && position < wordList.size()) {
            wordList.remove(position);
        } else {
            System.out.println("Invalid position!");
        }
    }

    public void displayList() {
        if (!wordList.isEmpty()) {
            System.out.println("Word List:");
            for (String word : wordList) {
                System.out.println(word);
            }
        } else {
            System.out.println("List is empty!");
        }
    }

    public boolean searchWord(String word) {
        return wordList.contains(word);
    }

    public static void main(String[] args) {
        WordLinkedList wordLinkedList = new WordLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Insert word in the beginning");
            System.out.println("2. Insert word at a given position");
            System.out.println("3. Delete word from the beginning");
            System.out.println("4. Delete word from a given position");
            System.out.println("5. Display complete list");
            System.out.println("6. Search a specific word");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter word to insert: ");
                    String word = scanner.next();
                    wordLinkedList.insertWordAtBeginning(word);
                    break;
                case 2:
                    System.out.print("Enter word to insert: ");
                    word = scanner.next();
                    System.out.print("Enter position: ");
                    int position = scanner.nextInt();
                    wordLinkedList.insertWordAtPosition(word, position);
                    break;
                case 3:
                    wordLinkedList.deleteWordFromBeginning();
                    break;
                case 4:
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    wordLinkedList.deleteWordFromPosition(position);
                    break;
                case 5:
                    wordLinkedList.displayList();
                    break;
                case 6:
                    System.out.print("Enter word to search: ");
                    word = scanner.next();
                    boolean found = wordLinkedList.searchWord(word);
                    if (found) {
                        System.out.println("Word found!");
                    } else {
                        System.out.println("Word not found!");
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        scanner.close();
    }
}