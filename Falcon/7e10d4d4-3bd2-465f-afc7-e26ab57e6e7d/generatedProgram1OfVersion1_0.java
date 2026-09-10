import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String searchStr = sc.nextLine();
        int index = str.indexOf(searchStr);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Last index of " + searchStr + " in " + str + " is " + index);
        }
    }
}

// 