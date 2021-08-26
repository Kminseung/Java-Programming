package UDF;

public class func3 {
	
	// 문자열을 입력받아 마지막 문자 반환 함수
	public static char function(String input) {
		return input.charAt(input.length() -1);
	}

	public static void main(String[] args) {
		System.out.println("Hello World의 가장 마지막 단어는 " + function("Hello World"));
	}

}
