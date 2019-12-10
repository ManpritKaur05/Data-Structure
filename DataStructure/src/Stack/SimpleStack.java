package Stack;

public class SimpleStack {
	
	private int maxSize;
	private int top;
	private int[] stackArray;
	
	public SimpleStack(int size) {
		this.maxSize = size;
		this.top = -1;
		this.stackArray = new int[size];
	}

	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		stackArray[top] = data;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	
	public int pop() {
		if(isEmpty()) {
			
			System.out.println("Stack is empty");
		}
		
		int old_top = top;
		top--;
		return stackArray[old_top];
	}
	
	public boolean isEmpty() {
		
		return top == -1;
	}

	public static void main(String[] args) {
		
		SimpleStack st = new SimpleStack(5);
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(9);
		
		
		while(!st.isEmpty()) {
			
			int value = st.pop();
			System.out.println(value);
		}
		
	}

}
