package Array;

public class Array2 {

	// 배열의 100개 랜덤 값의 평균 값 구하기
	public static void main(String[] args) {

		int[] array = new int[100];
		for(int i=0; i<100; i++) {
			array[i] = (int)(Math.random() * 100 + 1);
			// Math.random() : 0 <= x <1 사이의 수
			// Math.random() * 100 + 1 : 1 <= x <=100 사이의 수
		}
		
		int sum = 0;
		for(int i=0; i<100; i++) {
			sum += array[i];
		}
		System.out.println("100개의 랜덤 정수의 평균 값은 " + sum/100 + "입니다.");
		// 데이터가 많으면 많을수록 50에 수렴하는 듯 하다.
	}

}
