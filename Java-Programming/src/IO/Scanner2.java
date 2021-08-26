package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {

		File file = new File("input.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// try 구문 실행 중 예외 발생 시 실행
			System.out.println("파일을 읽어오는 중 오류가 발생했습니다.");
		}

	}

}
