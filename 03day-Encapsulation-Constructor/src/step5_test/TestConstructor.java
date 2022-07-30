package step5_test;

public class TestConstructor {
	/*
	 * Person : Data Type 이자 class 명
	 * p : 객체를 참조하는 변수 
	 * = : assign 할당
	 * new : 객체 생성시 사용하는 자바 예약어
	 * Person() : Constructor 생성자 호출
	 * Person p = new Person();
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);
		
		Person p2 = new Person();
		System.out.println(p2);
		
		Person p3 = new Person();
		System.out.println(p3);
	}
}
