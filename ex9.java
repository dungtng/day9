package hw8;

public class ex9 {

	public static void main(String[] args) {
		int array[] = { 1, 3, 5, 6, 9, 111, 140 };
		int value = 5;
		int indexOfValue = findIndexOf(5, array);
		System.out.println("Index of "+ value + " IS: " + indexOfValue);

	}

	public static int findIndexOf(int value, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (value == arr [i]) {
				return i;
			}
		}
		return 0;
	}
}
