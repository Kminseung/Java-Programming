package Recursive;

public class Recursive3 {
	
	// 피보나치 수열 : 1 1 2 3 5 8 13 21 ...
	// n번째 피보나치 수열 값 구하기
	public static int fibonacci(int n) {
		int one = 1;
		int two = 1;
		int result = -1;
		
		if(n == 1) {
			return one;
		} else if(n == 2) {
			return two;
		} else {
			for(int i=2; i<n; i++) {
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10) + "입니다.");

	}

}
