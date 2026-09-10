public class ReverseLinkedList {

    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);

        // Reverse the linked list
        LinkedList<Integer> reversedList = reverseLinkedList(list);

        // Print the reversed linked list
        System.out.println(reversedList);
    }

    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        if (list == null || list.size() == 0) {
            return list;
        }

        LinkedList<T> reversedList = new LinkedList<>();
        LinkedList<T> current = list;

        while (current != null) {
            reversedList.addFirst(current.getValue());
            current = current.getNext();
        }

        return reversedList;
    }
}
