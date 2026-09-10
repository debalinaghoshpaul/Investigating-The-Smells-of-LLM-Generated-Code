import java.util.Scanner;

public class ReplacePythonWithJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replaceAll("python", "java");
        System.out.println(str);
    }
}

