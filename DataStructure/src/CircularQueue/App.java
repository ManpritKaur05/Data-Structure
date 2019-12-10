package CircularQueue;

public class App {

	public static void main(String[] args) {
		CQueue m = new CQueue(5);
		m.insert(10);
		m.insert(20);
		m.insert(30);
		m.insert(40);
		m.insert(50);

		m.view();
	}

}
