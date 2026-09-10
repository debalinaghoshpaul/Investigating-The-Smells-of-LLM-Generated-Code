import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = sc.nextLine().split(" ");
        int n = arr.length;
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(str)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + pos);
        }
    }
}

// 