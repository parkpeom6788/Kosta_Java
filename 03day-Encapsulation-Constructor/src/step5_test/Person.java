package step5_test;

public class Person {
	
	/*
	 *  class 내부에서 생성자를 직접 명시 하지 않으면
	 *  컴파일시에 자동 삽입 된다.
	 */
	public Person() {
		System.out.println("Person 생성자 실행 => 객체 생성");
	}
}
