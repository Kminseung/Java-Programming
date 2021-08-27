package Interface;

public class Interface implements Dog {

	public static void main(String[] args) {
		
		Interface i = new Interface();
		i.crying();
		i.show();
		
	}

	@Override
	public void crying() {
		System.out.println("월! 월!");
	}

	@Override
	public void show() {
		System.out.println("Hello World!");
	}

}
