import java.util.HashSet;

public class SetOperationsExample {

    public static void main(String[] args) {
        HashSet<String> stack1 = new HashSet<>();
        stack1.add("Chemistry");
        stack1.add("Mathematics");
        stack1.add("Biology");
        stack1.add("English");

        HashSet<String> stack2 = new HashSet<>();
        stack2.add("Biology");
        stack2.add("English");
        stack2.add("Geography");
        stack2.add("Physics");

        // Clone the sets to preserve the original sets from being changed by set methods
        HashSet<String> stack1Clone = (HashSet<String>) stack1.clone();
        HashSet<String> stack2Clone = (HashSet<String>) stack2.clone();

        // (1) Subjects only present in the first stack
        stack1Clone.removeAll(stack2);
        System.out.println("Subjects only present in the first stack: " + stack1Clone);

        // (2) Subjects only present in the second stack
        stack2Clone.removeAll(stack1);
        System.out.println("Subjects only present in the second stack: " + stack2Clone);

        // (3) Subjects present in both stacks
        stack1.retainAll(stack2);
        System.out.println("Subjects present in both stacks: " + stack1);
    }
}
