package Recursive;

public class Recursive2 {
	
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
			// 5! = 5 * 4! = 5 * 4 * 3! = ... = 5 * 4 * 3 * 2 * 1
		}
	}

	public static void main(String[] args) {
		System.out.println("10 팩토리얼은 " + factorial(10));
	}

}
