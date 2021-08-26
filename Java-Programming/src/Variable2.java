
public class Variable2 {
	
	// final : 상수 - 메인함수 바깥에 선언, 한 번 선언되면 바뀔 수 없음.
	// static : 하나의 클래스에서 공유하는 자원
	final static double PI = 3.141592;

	public static void main(String[] args) {
		
		int r = 30;
		System.out.println(r * r * PI);

	}

}
