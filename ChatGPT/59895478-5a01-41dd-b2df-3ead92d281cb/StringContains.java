
public class StringContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept two strings from user
        System.out.print("Input first string: ");
        String first = scanner.nextLine();
        
        System.out.print("Input second string: ");
        String second = scanner.nextLine();
        
        // Test if the second string contains the first one
        boolean contains = second.contains(first);
        
        System.out.println("If the second string contains the first one? " + contains);
        
        scanner.close();
    }
}
