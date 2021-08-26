package LoopConditional;

public class Loop2 {
	
	final static int N = 10;

	public static void main(String[] args) {

		// for문 : 초기화; 조건; 연산
		for(int i = N; i>0; i--) {
			System.out.println("*");
		}

		System.out.println();
		
		for(int i = N; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
