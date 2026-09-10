// Java program to retrieve first element of linked list 

// Node class 
class Node { 
	int data; 
	Node next; 
} 

// Linked List class 
class LinkedList { 
	Node head; // Head of the list 

	// Function to retrieve first element 
	// of the linked list 
	public int peek() 
	{ 
		// Check if the list is empty 
		if (head == null) 
			// Throw an exception 
			throw new RuntimeException("List is empty"); 

		// Return the data of the head node 
		return head.data; 
	} 

	// Function to insert a node at the 
	// beginning of the linked list 
	public void push(int data) 
	{ 
		// Create a new node with given data 
		Node newNode = new Node(); 
		newNode.data = data; 

		// Make the new node as head 
		newNode.next = head; 
		head = newNode; 
	} 

	// Function to print the linked list 
	public void printList() 
	{ 
		Node temp = head; 
		while (temp != null) { 
			System.out.print(temp.data + " "); 
			temp = temp.next; 
		} 
		System.out.println(); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		LinkedList llist = new LinkedList(); 
		llist.push(1); 
		llist.push(2); 
		llist.push(3); 
		llist.push(4); 
		llist.push(5); 

		System.out.println("Linked list: "); 
		llist.printList(); 

		System.out.println("First element of the list: " + llist.peek()); 
	} 
} 
