
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String compressedString = sc.nextLine();
            String originalString = restoreString(compressedString);
            System.out.println(originalString);
        }

        sc.close();
    }

    public static String restoreString(String compressedString) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < compressedString.length(); i++) {
            char currentChar = compressedString.charAt(i);

            if (currentChar == '#') {
                int count = Character.getNumericValue(compressedString.charAt(i + 1));
                char repeatedChar = compressedString.charAt(i + 2);

                for (int j = 0; j < count; j++) {
                    sb.append(repeatedChar);
                }

                i += 2;
            } else {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}