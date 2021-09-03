package b_List.c_LinkedList;

public class a_CreatingCustomSinglyLinkedList {
	
	Node head;	// Class reference variable
	
	// Creating an Inner Class
	class Node{
		int data;
		Node next;	// Class reference variable
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	/**
	 * Printing my Linked List
	 */
	public void printMyLinkedList() {		
		Node n = head;					// assign current Head to Class reference variable
		while(n!=null) {				// traverse inside the linked list until head points to tail i.e. null
			System.out.println(n.data);	// n.data will fetch the data in that node i.e. 10, 20, 30 
			n = n.next;					// n.next will point to next node
		}
	}

	public static void main(String[] args) {
		a_CreatingCustomSinglyLinkedList obj = new a_CreatingCustomSinglyLinkedList();
		
		// Creating a Node -->  adding data --> setting "next" to null
		Node firstNode = obj.new Node(10);  // Accessing Inner class using Outer Class object
		
		// setting head to newly created Node
		obj.head = firstNode;
		
// ------------------------------------------------------------------------------------- //
		// creating new node + adding data + setting next to null
		Node secondNode = obj.new Node(20);		
		// Set next of 1st note to point to Data of 2nd node
		firstNode.next = secondNode;
// ------------------------------------------------------------------------------------- //
		// creating new node + adding data + setting next to null
		Node thirdNode = obj.new Node(30);		
		// Set next of 1st note to point to Data of 2nd node
		secondNode.next = thirdNode;
// ------------------------------------------------------------------------------------- //		
		obj.printMyLinkedList();	// 10, 20, 30
		
	}
}
