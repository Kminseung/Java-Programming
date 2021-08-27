package Class;

public class Node {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// 생성자
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 두 점 중간의 좌표 찾기
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getX()) / 2);
	}
}
