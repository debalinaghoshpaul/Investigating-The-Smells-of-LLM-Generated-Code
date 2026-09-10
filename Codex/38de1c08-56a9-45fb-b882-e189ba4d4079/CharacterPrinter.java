public class CharacterPrinter {
    public static void printCharacters(char start, char end) {
        int count = 0;
        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
            count++;
            if (count % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        char start = 'A';
        char end = 'P';
        printCharacters(start, end);
    }
}
