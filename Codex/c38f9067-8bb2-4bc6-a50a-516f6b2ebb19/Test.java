public class Test {
    public static boolean checkAllVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "example";
        boolean result = checkAllVowels(input);
        System.out.println(result);
    }
}
