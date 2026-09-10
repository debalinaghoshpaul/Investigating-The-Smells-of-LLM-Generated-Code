public class MissingLetter {
    public static void main(String[] args) {
        String[] arr = {"p", "r", "s", "t"};
        String missingLetter = "q";
        int index = arr.length - 1;
        while (index >= 0) {
            if (arr[index]!= missingLetter) {
                break;
            }
            index--;
        }
        if (index < 0) {
            System.out.println(missingLetter);
        } else {
            System.out.println(arr[index]);
        }
    }
}

