package CircularLinkedList;

public class App {

	public static void main(String[] args) {

		CircularLL myList = new CircularLL();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(44);
		myList.insertFirst(67);

		myList.displayList();

	}

}
