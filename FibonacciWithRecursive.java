package hw8;

public class FibonacciWithRecursive {

	public static void main(String[] args) {
		int number = 23;
		int result = fibonacci(number);
		System.out.println("The fibonacci number at the position " + number + " is " + result);
	}

	public static int fibonacci(int numb) {
		if (numb == 0) {
			return numb;
		}else if (numb == 1) {
			return numb;
		}else {
			return fibonacci (numb-2) + fibonacci (numb-1);
		}
	}
}
//Time Complexity O(n)
