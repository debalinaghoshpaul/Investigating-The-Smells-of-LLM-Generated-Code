public class RotateString {

    public static void main(String[] args) {
        String str = "abcde";
        int offset = 2;

        String rotatedString = rotateString(str, offset);

        System.out.println(rotatedString); // "cdeab"
    }

    public static String rotateString(String str, int offset) {
        StringBuilder sb = new StringBuilder();

        offset = offset % str.length();

        for (int i = offset; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }

        for (int i = 0; i < offset; i++) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
