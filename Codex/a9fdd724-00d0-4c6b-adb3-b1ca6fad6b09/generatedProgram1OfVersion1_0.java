public class JumpItGame {
    public static int cheapestCost(int[] board, int index) {
        if (index >= board.length) {
            return 0;
        }
        
        int cost1 = board[index] + cheapestCost(board, index + 1);
        int cost2 = board[index] + cheapestCost(board, index + 2);
        
        return Math.min(cost1, cost2);
    }
    
    public static void main(String[] args) {
        int[] board = {0, 3, 80, 6, 57, 10};
        int cheapestCost = cheapestCost(board, 0);
        System.out.println("Cheapest cost: " + cheapestCost);
    }
}