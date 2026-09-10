import java.util.*;

public class ExcelColumnName {

    public static String getExcelColumnName(int columnNumber) {
        StringBuilder columnName = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = columnNumber % 26;
            if (remainder == 0) {
                remainder = 26;
            }
            columnName.insert(0, (char)('A' + remainder - 1));
            columnNumber = (columnNumber - remainder) / 26;
        }

        return columnName.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test cases
        int[] columnNumbers = {1, 26, 52, 701, 1000, 18278};

        for (int columnNumber : columnNumbers) {
            String columnName = getExcelColumnName(columnNumber);
            System.out.println(columnNumber + " -> " + columnName);
        }

        scanner.close();
    }
}
