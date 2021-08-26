package LoopConditional;

public class Conditional3 {

	public static void main(String[] args) {

		String gender = "Man";
		int i = 0;
		
		// String 비교 시 equals() 사용
		if(gender.equals("Man")) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("남자가 아닙니다.");
		}
		
		if(i == 3) {
			System.out.println("i는 3입니다.");
		} else {
			System.out.println("i는 3이 아닙니다.");
		}
		
		// equalsIgnoreCase 대소문자 구분 안함
		if(gender.equalsIgnoreCase("man") && i==0) {
			System.out.println("참입니다.");
 		} else {
 			System.out.println("거짓입니다.");
 		}

	}

}
