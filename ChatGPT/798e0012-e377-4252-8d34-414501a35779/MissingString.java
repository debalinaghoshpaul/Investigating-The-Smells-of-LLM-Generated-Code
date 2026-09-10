public class MissingString {
    
    public static void main(String[] args) {
        String str1 = "Hello World, How are you?";
        String str2 = "Hello How you?";
        
        String missingString = findMissingString(str1, str2);
        
        System.out.println("Missing String: " + missingString);
    }
    
    public static String findMissingString(String str1, String str2) {
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        
        for (String s : arr1) {
            if (!str2.contains(s)) {
                return s;
            }
        }
        
        return "";
    }
}
