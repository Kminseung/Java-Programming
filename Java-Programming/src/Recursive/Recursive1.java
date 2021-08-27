package Recursive;

public class Recursive1 {
	
	// 팩토리얼 함수 : 5! = 5 * 4 * 3 * 2 * 1 = 120
	public static int factorial(int n) {
		int sum = 1;
		for(int i=2; i<=n; i++) {
			sum *= i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("10 팩토리얼은 " + factorial(10));
	}

}
