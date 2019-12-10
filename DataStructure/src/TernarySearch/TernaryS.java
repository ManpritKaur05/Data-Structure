package TernarySearch;

public class TernaryS {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8};
		int l = 0;
		int r = arr.length-1;
		int key = 7;
		
		int val = TernaryS(l, r, key, arr);
		
		System.out.println("Element found i.e. " + val);
	}
	
	public static int TernaryS(int l, int r, int key, int[] arr) {
		
		if(r>=l) {
			
			int mid1 = l + (r-l)/3;
			int mid2 = r - (r-l)/3;
			
			if(key == arr[mid1]) {
				return mid1;
			}
			else if(key == arr[mid2]) {
				return mid2;
			}
			else if(key < arr[mid1]) {
				return TernaryS(l, mid1-1, key, arr);
			}
			else if(key > arr[mid2]) {
				return TernaryS(mid2+1, r, key, arr);
			}
			else {
				return TernaryS(mid1+1, mid2-1, key, arr);
			}
		}
		return -1;
	}

}
