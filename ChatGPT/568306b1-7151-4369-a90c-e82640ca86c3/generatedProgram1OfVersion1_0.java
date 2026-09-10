public class Main {

    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = findLength(str);
        System.out.println("Length of the string '" + str + "' is: " + length);
    }

    public static int findLength(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return 1 + findLength(str.substring(1));
        }
    }
}
