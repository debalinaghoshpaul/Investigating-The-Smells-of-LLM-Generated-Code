
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();
        
        int index = line.indexOf("hate");
        if(index != -1){
            line = line.substring(0, index) + "love" + line.substring(index + 4);
        }
        
        System.out.println("I have rephrased that line to read:");
        System.out.println(line);
        
        scanner.close();
    }
}