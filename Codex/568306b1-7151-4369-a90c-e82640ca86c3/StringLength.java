public class StringLength {

	public static int findLength(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		} else {
			return 1 + findLength(str.substring(1));
		}
	}

	public static void main(String[] args) {
		String str = "Hello World";
		int length = findLength(str);
		System.out.println("The length of the string is: " + length);
	}
}
