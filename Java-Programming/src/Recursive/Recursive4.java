package Recursive;

public class Recursive4 {

	public static int fibonacci(int n) {
		if(n == 1) {
			return 1;
		} else if(n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10) + "입니다.");

	}

}
