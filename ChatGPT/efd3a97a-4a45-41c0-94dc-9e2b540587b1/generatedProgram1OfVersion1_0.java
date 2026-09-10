
public class AddStrings {

    public static String addStrings(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        
        BigInteger sum = n1.add(n2);
        
        return sum.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        
        String result = addStrings(num1, num2);
        
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }
}