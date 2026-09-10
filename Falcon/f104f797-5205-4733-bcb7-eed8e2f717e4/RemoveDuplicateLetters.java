import java.util.*;

public class RemoveDuplicateLetters {

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"bcabc", "cbacdcbc", "bcabbcad", "abcabcbb", "thequickbrownfoxjumpsoverthelazydog", "abc"};

        for (String testCase : testCases) {
            String result = removeDuplicateLetters(testCase);
            System.out.println("Original: " + testCase + "; Result: " + result);
        }
    }

    public static String removeDuplicateLetters(String s) {
        // Create a stack to store the characters in order
        Stack<Character> stack = new Stack<>();

        // Create a set to store the characters that have been added to the stack
        Set<Character> visited = new HashSet<>();

        // Iterate over the characters in the string
        for (char c : s.toCharArray()) {
            // If the character is already in the stack, skip it
            if (visited.contains(c)) {
                continue;
            }

            // While the stack is not empty and the character at the top of the stack is greater than the current character, pop the character from the stack
            while (!stack.isEmpty() && stack.peek() > c) {
                stack.pop();
            }

            // Add the current character to the stack
            stack.push(c);

            // Add the current character to the set of visited characters
            visited.add(c);
        }

        // Convert the stack to a string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Reverse the string to get the lexicographical order
        return result.reverse().toString();
    }
}
