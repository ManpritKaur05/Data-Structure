package Recursion;

public class RecursiveLinearSearch {
	
	public static void main(String[] args) {
		
		System.out.println(recursiveSearch(new int[] {2,7,4,6,9,0,5}, 0, 4));
		
	}
	
	public static int recursiveSearch(int[] a, int i, int x) {
		
		if(i > a.length-1) { //if evaluates to true, x was not found in the array
			return -1;
		}
		else if(a[i] == x) {
			return i;
		}
		else {
			//System.out.println("index at: " + i);
			return recursiveSearch(a, i+1, x);
		}
	}

}
