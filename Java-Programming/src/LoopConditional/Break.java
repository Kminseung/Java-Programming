package LoopConditional;

public class Break {

	public static void main(String[] args) {

		int count = 0;
		
		for(;;) {
			System.out.println("출력");
			count ++;
			if(count == 10) {
				break;
			}
		}

	}

}
