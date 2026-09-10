import java.util.Scanner;

public class GetLastNVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter the number of vowels to get: ");
		int n = Integer.parseInt(sc.nextLine());

		String vowels = "aeiouAEIOU";
		String lastNVowels = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			if (vowels.indexOf(str.charAt(i)) != -1) {
				lastNVowels += str.charAt(i);
				if (lastNVowels.length() == n) {
					break;
				}
			}
		}

		System.out.println("The last " + n + " vowels of the given string are: " + lastNVowels);
	}
}
