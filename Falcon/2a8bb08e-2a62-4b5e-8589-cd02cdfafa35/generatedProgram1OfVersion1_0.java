import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = "";
        int index = 0;
        while (index < str.length()) {
            if (str.charAt(index)!= 'x') {
                newStr += str.charAt(index);
            }
            index++;
        }
        System.out.println(newStr);
    }
}

// 