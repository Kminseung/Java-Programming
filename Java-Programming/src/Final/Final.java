package Final;

public class Final extends Parent {
// public class Final extends FinalClass {
// final class 상속 불가능
	
	/* 
	 * overriding 불가능

	public void show() {
		System.out.println("Hello!");
	}
	*/
	
	public static void main(String[] args) {
		
		final int number = 10;
		// number = 5;
		// 실행 시 오류
		System.out.println(number);
		
		Final f = new Final();
		f.show();
		
		
	}

}
