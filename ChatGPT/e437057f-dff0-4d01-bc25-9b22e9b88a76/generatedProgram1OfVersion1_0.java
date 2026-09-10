public class BooleanArrayPrinter {
    public static void main(String[] args) {
        boolean[][] array = {{true, false, true}, {false, true, false}};
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] ? "t " : "f ");
            }
        }
    }
}
