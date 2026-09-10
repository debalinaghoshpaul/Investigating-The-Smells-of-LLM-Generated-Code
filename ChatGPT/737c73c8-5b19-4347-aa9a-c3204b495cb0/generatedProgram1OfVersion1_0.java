public class Main {
    public static void main(String[] args) {
        int originalNumber = 2350;
        
        int result = largestLog(originalNumber);
        
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Result: " + result);
    }
    
    public static int largestLog(int num) {
        int log = (int) (Math.log(num) / Math.log(2)); // Calculate base-2 logarithm
        
        return log;
    }
}
