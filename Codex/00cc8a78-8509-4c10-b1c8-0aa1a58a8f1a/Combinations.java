public class Combinations {
    public static void main(String[] args) {
        String[][] data = {
            {"A", "B"},
            {"1", "2"},
            {"XX", "YY", "ZZ"}
        };
        generateCombinations(data, 0, new StringBuilder());
    }

    public static void generateCombinations(String[][] data, int index, StringBuilder sb) {
        if (index == data.length) {
            System.out.println(sb.toString());
            return;
        }

        for (int i = 0; i < data[index].length; i++) {
            sb.append(data[index][i]).append(" ");
            generateCombinations(data, index + 1, sb);
            sb.delete(sb.length() - data[index][i].length() - 1, sb.length());
        }
    }
}
