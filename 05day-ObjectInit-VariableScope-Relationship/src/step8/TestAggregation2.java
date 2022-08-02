package step8;

import java.util.Scanner;

//aggregation : has a relationship 학생이 노트북을 소유하다
public class TestAggregation2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		// 아래 코드에 대응하는 Student의 인스턴스 변수와 메서드를 정의해본다
		s.setName("아이유");
		System.out.println(s.getName());
		// 아이유 Student 객체가 소유한 NoteBook의 
		// model 명을 반환받아 출력 
		s.setNotebook(new NoteBook("SAMSUNG","WHITE"));
		System.out.println("노트북은 : " + s.getNotebook().getModel());
		System.out.println("색깔은 : " + s.getNotebook().getColor());
		// 흰색에서 빨간색으로 color 를 변경
		s.getNotebook().setColor("RED");
		System.out.println("변경된 색깔은 : " + s.getNotebook().getColor());
		System.out.println("*******************");
		System.out.println(s.toString());
		
	}
}
