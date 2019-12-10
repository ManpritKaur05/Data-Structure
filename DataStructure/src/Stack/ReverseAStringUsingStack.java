package Stack;

public class ReverseAStringUsingStack {
	
	private int maxSize;
	private int top;
	private char stackArray[];
	
	public ReverseAStringUsingStack(int size) {
		
		this.maxSize = size;
		this.top = -1;
		this.stackArray = new char[maxSize];
		
	}
	
	public void push(char data) {
		
		if(isFull()) {
			System.out.println("stack is full");
		}
		top++;
		stackArray[top] = data;
	}
	
	public boolean isFull() {
		
		return top == maxSize-1;
	}
	
	public char pop() {
		
		if(isEmpty()) {
			
			System.out.println("stack is empty");
			return '0';
		}
		int old_top = top;
		top--;
		return stackArray[old_top];
	}
	
	public boolean isEmpty() {
		
		return top == -1;
	}
	
	public static void reverseString(String str) {
		
		int stackSize = str.length();
		ReverseAStringUsingStack st = new ReverseAStringUsingStack(stackSize);
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			st.push(ch);
		}
		
		String reverse="";
		while(!st.isEmpty()) {
			char string = st.pop();
			reverse = reverse + string;
		}
		System.out.println( reverse);

	}
	
	public static void main(String[] args) {
		
		reverseString("manprit");
	}

}
