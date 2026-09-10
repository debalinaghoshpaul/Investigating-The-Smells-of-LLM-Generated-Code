public class PrintCodeword {

    private char letter;
    private int digit;

    public PrintCodeword(char initialLetter, int initialDigit) {
        this.letter = initialLetter;
        this.digit = initialDigit;
    }

    public void print_Code() {
        for (int i = 0; i < 26; i++) {
            System.out.print(letter + "" + digit + ", ");
            letter = (char) ((letter - 'A' + 1) % 26 + 'A');
            digit = (digit + 1) % 10;
        }
    }

    public static void main(String[] args) {
        PrintCodeword codeword = new PrintCodeword('D', 5);
        codeword.print_Code();
    }
}
