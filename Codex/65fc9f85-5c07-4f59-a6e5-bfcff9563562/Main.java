import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(6);
        
        TreeSet<Integer> numbersLessThan7 = new TreeSet<>();
        for (Integer number : numbers) {
            if (number < 7) {
                numbersLessThan7.add(number);
            }
        }
        
        System.out.println("Numbers less than 7: " + numbersLessThan7);
    }
}
