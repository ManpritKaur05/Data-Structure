package DoublyLinkedList;

public class DoublyLL {
	
	private Node first;
	private Node last;
	
	public DoublyLL() {
		this.first=null;
		this.last=null;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public void insertFirst(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			
			last=newNode; // if empty, last will refer to the new node being created
		}
		else {
			
			first.previous = newNode;
		}
		
		newNode.next = first; // the new node's next field will point to old first
		this.first = newNode;
	}
	
	public void insertLast(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}
		else {
			last.next = newNode; //assigning old last to new node
			newNode.previous = last; //the old last will be the new node's precious		
		}
		
		last = newNode; //the linkedlist's last field should point to the new node
		
	}
	
	//assume non-empty list
	public Node deleteFirst() {
		
		Node temp = first;
		
		if(first.next == null) { //there is only one item in list
			last = null;
		}
		else {
			first.next.previous = null; //the list's first node will point to null
		}
		
		first = first.next; //we are assigning the reference of the node following the old first node to the first field in the linked list
		return temp; // return the deleted old first node
	}
	
	//assume non-empty list
	public Node deleteLast() {
		
		Node temp = last;
		
		if(first.next == null) { //we only have one node 
			first = null;
		}
		else {
			last.previous.next = null; //the last node's previous node's next field will point to null
		}
		
		last = last.previous;
		return temp;
	}
	
	//assume non-empty list
	//inserting in somewhere middle of list
	
	public boolean insertAfter(int key, int data) {
		
		Node current = first; //we start from beginning of the list
		
		while(current.data != key) { //as long as we have not found the key in particular position
			
			current = current.next;
			
			if(current == null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last) {
			current.next = null;
			last = newNode;
		}
		else {
			newNode.next = current.next; //new node's next field should point to the node ahead of current node
			current.next.previous = newNode; //the node ahead of current, it's previous field should point to the newNode
			
		}
		
		newNode.previous = current;
		current.next = newNode;
		
		return true;
	}
	
	
	//assume non-empty list
	public Node deleteKey(int key) {
		Node current = first; //start from beginning
		
		while(current.data != key) {
			current =current.next;
			
			if(current == null) {
				return null;
			}
		}
		
		if(current == first) {
			first = current.next; //first field point to node following current node
		}
		else {
			current.previous.next = current.next;
		}
		
		if(current == last) {
			last = current.previous;
		}
		else {
			current.next.previous = current.previous;
		}
		
		return current;
		
		
	}

	
	public void displayForward() {
		
		System.out.print("list (first to last) : ");
		Node current = first;
		
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		
		System.out.print("list (last to first) : ");
		Node current = last;
		
		while(current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
}
















