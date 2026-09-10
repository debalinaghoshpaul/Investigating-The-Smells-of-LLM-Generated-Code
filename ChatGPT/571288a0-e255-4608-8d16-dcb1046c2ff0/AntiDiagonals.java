import java.util.ArrayList;

public class AntiDiagonals {
    
    public static ArrayList<ArrayList<Integer>> getAntiDiagonals(int[][] matrix) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> antiDiagonal = new ArrayList<>();
            int row = 0;
            int col = i;
            
            while (row < n && col >= 0) {
                antiDiagonal.add(matrix[row][col]);
                row++;
                col--;
            }
            
            result.add(antiDiagonal);
        }
        
        for (int i = 1; i < n; i++) {
            ArrayList<Integer> antiDiagonal = new ArrayList<>();
            int row = i;
            int col = n - 1;
            
            while (row < n && col >= 0) {
                antiDiagonal.add(matrix[row][col]);
                row++;
                col--;
            }
            
            result.add(antiDiagonal);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16}};
                           
        ArrayList<ArrayList<Integer>> result = getAntiDiagonals(matrix);
        
        System.out.println(result);
    }
}
