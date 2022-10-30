package hw8;

public class Fibonanci {

	public static void main(String[] args) {
		int number = 23;
		int result = fibonacci(number);
		System.out.println("The fibonacci number at the position " + number + " is " + result);
	}

	public static int fibonacci(int numb) {
		int [] temparr = new int [numb+1];
		int sum = 0;
		if (numb == 0 || numb == 1) {
			return numb;
		}
		for(int i = 0; i <= numb; i++) {
			if (i == 0 ) {
				temparr [0] = i;
			}else if (i == 1) {
				temparr [1] = i;
			}else {
				sum = temparr[i-1]+temparr[i-2];
				temparr[i] = sum;
			}
		}
		return sum;
	}
}
