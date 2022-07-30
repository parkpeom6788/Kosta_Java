package step5;

public class Person {
		/*
				class 내부에서 생성자를 직접 명시하지 않으면
				컴파일시에 자동 삽입된다
		 */
	public Person() { // 생성자 명은 클래스 명과 동일해야 한다.
		 System.out.println("Person 생성자 실행 => 객체생성");
	}
}
