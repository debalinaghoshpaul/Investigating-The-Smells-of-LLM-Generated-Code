public class AlternateCheck {
    public static void main(String[] args) {
        int[] arr = {1, -2, 5, -4, 3, -6};
        
        boolean alternate = true;
        
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] >= 0 && arr[i-1] >= 0) || (arr[i] < 0 && arr[i-1] < 0)) {
                alternate = false;
                break;
            }
        }
        
        System.out.println("Check the said array of integers alternates between positive and negative values: " + alternate);
    }
}
