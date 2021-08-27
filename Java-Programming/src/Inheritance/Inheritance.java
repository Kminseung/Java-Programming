package Inheritance;

public class Inheritance {

	public static void main(String[] args) {

		Student student1 = new Student("홍길동", 20, 175, 70, "2014301001", 1, 4.5);
		Student student2 = new Student("이순신", 25, 180, 77, "2017301001", 1, 4.0);
		
		student1.show();
		student2.show();

	}

}
