public class AlternatePosNeg {
    public static void main(String[] args) {
        int[] array = {1, -2, 5, -4, 3, -6}; // example array
        
        boolean alternate = checkIfAlternate(array);
        
        System.out.println("Check if the array alternates between positive and negative values: " + alternate);
    }
    
    public static boolean checkIfAlternate(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] >= 0 && array[i + 1] >= 0) || (array[i] < 0 && array[i + 1] < 0)) {
                return false;
            }
        }
        
        return true;
    }
}
