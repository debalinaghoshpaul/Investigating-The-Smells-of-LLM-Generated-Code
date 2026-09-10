public class ExcelColumnName {
    public static String getColumnName(int columnNumber) {
        StringBuilder columnName = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26;
            columnName.insert(0, (char) (remainder + 'A'));
            columnNumber = (columnNumber - 1) / 26;
        }

        return columnName.toString();
    }

    public static void main(String[] args) {
        int columnNumber = 28;
        String columnName = getColumnName(columnNumber);
        System.out.println("Excel column name for column number " + columnNumber + " is: " + columnName);
    }
}
