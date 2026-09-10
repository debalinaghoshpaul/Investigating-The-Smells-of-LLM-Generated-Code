public class ReverseLinkedList {

    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);

        // Reverse the linked list
        Node<Integer> reversedList = reverse(list.head);

        // Print the reversed linked list
        while (reversedList != null) {
            System.out.println(reversedList.data);
            reversedList = reversedList.next;
        }
    }

    public static Node<Integer> reverse(Node<Integer> head) {
        if (head == null) {
            return null;
        }

        Node<Integer> previous = null;
        Node<Integer> current = head;

        while (current != null) {
            Node<Integer> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
