package LinearSearch;

public class App {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 7, 8, 9 };

		int value = linearSearch(a, 9);
		System.out.println(value);
	}

	public static int linearSearch(int[] a, int x) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
