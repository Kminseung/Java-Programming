package UDF;

public class func2 {
	
	// 값을 입력받아 n번째 약수 찾기
	public static int function(int num, int k) {
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				k--;
				if(k == 0) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int result = function(3050, 10);
		
		if(result == -1) {
			System.out.println("3050의 10번째 약수는 없습니다.");
		} else {
			System.out.println("3050의 10번째 약수는 " + result + "입니다.");
		}
		
	}

}
