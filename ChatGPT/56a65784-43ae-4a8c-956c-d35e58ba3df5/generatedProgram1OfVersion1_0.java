import java.util.Arrays;

public class RemoveElementFromArrays {

    public static void main(String[] args) {
        // Test case 1: Remove 6 from the array
        int[] arr1 = {1, 4, 6, 7, 6, 2};
        int elementToRemove1 = 6;
        int[] updatedArray1 = removeElement(arr1, elementToRemove1);
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Updated array: " + Arrays.toString(updatedArray1));
        System.out.println("The length of the new array is: " + updatedArray1.length);

        // Test case 2: Remove 2 from the end of the linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int n = 2;
        Node newHead = removeNthFromEnd(head, n);
        System.out.println("Original node: " + printList(head));
        System.out.println("After removing " + n + "th element from end: " + printList(newHead));
    }

    public static int[] removeElement(int[] arr, int elementToRemove) {
        int[] newArr = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToRemove) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public static String printList(Node head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.data + " ");
            head = head.next;
        }
        return sb.toString();
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
