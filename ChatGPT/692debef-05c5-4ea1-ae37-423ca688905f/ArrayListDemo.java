import java.util.List;

public class ArrayListDemo {
    
    public static void main(String[] args) {
        
        // Creating an ArrayList
        List<Integer> numbers = new ArrayList<>();
        
        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        // Reversing elements in the ArrayList
        for(int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(numbers.size() - i - 1));
            numbers.set(numbers.size() - i - 1, temp);
        }
        
        System.out.println("Reversed ArrayList: " + numbers);
        
        // Extracting a portion of the ArrayList
        List<Integer> subList = numbers.subList(1, 4);
        
        System.out.println("SubList: " + subList);
    }

}
