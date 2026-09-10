
public class LastWordLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        int length = lastWordLength(str);
        
        System.out.println("Length of the last word: " + length);
    }
    
    public static int lastWordLength(String str) {
        str = str.trim();
        int length = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            }
            length++;
        }
        return length;
    }
}
