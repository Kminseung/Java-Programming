package IO;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		// Scanner 클래스를 import 해주어야 함
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int i = sc.nextInt();
		System.out.println("입력한 정수는 " + i + "입니다.");
		// 입출력 변수가 닫힘으로써 프로그램이 안전하게 종료됨
		sc.close();
	}
}
