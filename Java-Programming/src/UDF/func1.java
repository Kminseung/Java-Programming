package UDF;

public class func1 {
	
	// 최대 공약수 찾기 - 여러개의 숫자 중 공통된 가장 큰 약수
	// 반환형 함수명(매개변수)
	public static int function(int a, int b, int c) {
		int min;
		if(a > b) {
			if(b > c) {
				min = c;
			} else {
				min = b;
			}
		} else {
			if(a > c) {
				min = c;
			} else {
				min = a;
			}
		}
		
		for(int i=min; i>0; i--) {
			if(a%i == 0 && b%i == 0 && c%i == 0) {
				return i;
			}
		}
		// 최대 공약수가 없는 경우 -1을 반환
		return -1;
	}

	public static void main(String[] args) {
		
		System.out.println("(400, 300, 750)의 최대 공약수 : " + function(400, 300, 750));
		
	}
}
