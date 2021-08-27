package Inheritance;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까? ");
		int n = sc.nextInt();
		
		Student[] students = new Student[n];
		for(int i=0; i<n; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			
			System.out.print("학생의 이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("학생의 나이을 입력하세요 : ");
			age = sc.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = sc.nextInt();
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = sc.nextInt();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = sc.next();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = sc.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = sc.nextDouble();
			
			System.out.println();
			
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		
		for(int i=0; i<n; i++) {
			students[i].show();
		}
	}

}
