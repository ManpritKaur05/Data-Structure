package Recursion;

public class RecursiveBinarySearch {
	
	public static void main(String[] args) {
		
		System.out.println(recursiveSearch(new int[] {1,2,3,4,5,6,7,8}, 0, 7, 4));
	}
	
	public static int recursiveSearch(int[] a, int p, int r, int x) {
		
		if(p > r) {
			return -1;
		}
		else {
			
			int q= (p+r) /2;
			
			if(a[q]== x) {
				return q;
			}
			else if(a[q] > x) {
				return recursiveSearch(a, p, q-1, x);
			}
			else {
				return recursiveSearch(a, q+1, r, x);
			}
		}
		
	}

}
