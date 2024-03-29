package CircularLinkedList;

import SinglyLinkedList.Node;

public class CircularLL {

	private Node first;
	private Node last;

	public CircularLL() {
		first = null;
		last = null;
	}

	private boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(int data) {

		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			last = newNode;
		}
		newNode.next = first; // newNode is being assigned to old first	
		first = newNode;
	
	}
	
	public void insertLast(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}
		else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public int deleteFirst() {
		
		int temp = first.data;
		
		if(first.next == null) {
			last = null;
		}
		
		first = first.next; // first will point to old's next value
		return temp;
	}
	
	public void displayList() {

		System.out.println("List: ");
		Node current = first;
		while (current != null) {

			current.displayNode();
			current = current.next;
		}
	}

}












