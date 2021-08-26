
public class Overflow {

	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {

		int a = INT_MAX;
		System.out.println(a);

		// 오버 플로우
		System.out.println(a+1);
	}

}
