package Recursion;

public class App {

	public static void main(String[] args) {
		reduceByOne(10);
	}

	public static void reduceByOne(int n) {

		if (n >= 0) { //Base case

			reduceByOne(n - 1);
		}
		
		System.out.println("completed call: " + n);
	}

}
