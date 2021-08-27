package Interface;

public class MultiInterface implements Tiger, Cat {

	public static void main(String[] args) {
		
		MultiInterface mi = new MultiInterface();
		mi.one();
		mi.two();

	}
	
	@Override
	public void one() {
		System.out.println("야옹~");		
	}

	@Override
	public void two() {
		System.out.println("어흥~");
	}

}
