import java.util.Scanner;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > count) {
                count = strArr[i].length();
                maxCount = i;
            }
        }
        System.out.println("The second most frequent character in the string is " + strArr[maxCount]);
    }
}

// 