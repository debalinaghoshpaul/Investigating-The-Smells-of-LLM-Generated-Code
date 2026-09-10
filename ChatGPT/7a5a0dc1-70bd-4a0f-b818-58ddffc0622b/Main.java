public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 65, 77, 90};
        
        boolean contains65 = false;
        boolean contains77 = false;
        
        for(int num : numbers) {
            if(num == 65) {
                contains65 = true;
            } else if(num == 77) {
                contains77 = true;
            }
        }
        
        if(contains65 && contains77) {
            System.out.println("Array contains both 65 and 77");
        } else {
            System.out.println("Array does not contain both 65 and 77");
        }
    }
}
