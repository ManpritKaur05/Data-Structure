package SinglyLinkedList;

public class App {
	
	public static void main(String[] args) {
		
		SinglyLL myList = new SinglyLL();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(44);
		myList.insertFirst(67);
		
		myList.displayList();
		
	}

}
