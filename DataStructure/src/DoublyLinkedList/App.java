package DoublyLinkedList;

public class App {
	
	public static void main(String[] args) {
		
		DoublyLL myList = new DoublyLL();
		myList.insertFirst(22);
		myList.insertFirst(11);
		myList.insertFirst(87);
		
		myList.displayForward();
		
		myList.insertLast(54);
		myList.insertLast(67);
		myList.insertLast(93);
		
		myList.displayBackward();
		
		myList.deleteFirst();
		myList.deleteLast();
		myList.deleteKey(11);
		
		myList.displayForward();
		
		myList.insertAfter(54, 44);
		myList.insertAfter(22, 55);
		
		myList.displayForward();
	}

}
