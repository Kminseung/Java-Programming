package Array;

import java.util.Scanner;

public class Array1 {
	
	// 입력한 배열의 값 중 가장 큰 값 찾기
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요 : ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요 : ");
			array[i] = sc.nextInt();
		}
		
		int result = array[0];
		for(int i=0; i<n; i++) {
			result = max(result, array[i]);
		}
		System.out.println("입력한 모든 정수 중 가장 큰 값은 " + result + "입니다.");
	}

}
