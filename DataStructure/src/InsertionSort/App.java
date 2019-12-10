package InsertionSort;

public class App {

	public static void main(String[] args) {

		int myArray[] = insertionSort(new int[] { 9, 5, 2, 6, 56, 87, 23 });

		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i]+ " ");
		}

	}

	public static int[] insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {

			int ele = a[i]; //element which we are trying to bring in sorted area
			int j = i - 1; //variable points to index position of last value in sorted area

			while (j >= 0 && a[j] > ele) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = ele;
		}
		return a;
	}
}
