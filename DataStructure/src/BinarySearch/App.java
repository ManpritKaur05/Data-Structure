package BinarySearch;

public class App {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,7,8,9};
		
		int value = binarySearch(a, 7);
		System.out.println(value);
	}
	
	public static int binarySearch(int[] a, int x) {
		
		int start = 0;
		int end = a.length-1;
		
		while(start <= end) {
			
			int mid = (start+end) / 2;
			
			if(a[mid] > x) {
				end = mid-1;
			}
			else if(a[mid] < x){
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}

}
