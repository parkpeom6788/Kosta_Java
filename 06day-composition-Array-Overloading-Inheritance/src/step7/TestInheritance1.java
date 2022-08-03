package step7;

class Animal{ // super class 부모 클래스 
	int age = 1;
	public void eat() {
		System.out.println("eat");
	}
}
//sub class 자식 클래스 : 자식 Person 이 부모 Animal 을  상속받는다 
//										자식 Person이 부모 Animal을 확장해서 (extends) 정의한다 
class Person extends Animal { 
	public void study() {
		System.out.println("study");
	}
}

public class TestInheritance1 {
	public static void main(String[] args) {
		// 자식 Person 객체를 생성해서 테스트 해본다
		Person p = new Person();
		p.study(); // Person에 정의한 메서드 실행
		p.eat(); // Animal 로 부터 상속받은 메서드 실행 
		System.out.println(p.age); // Animal 로부터 상속받은 인스턴스 변수에 접근해서 출력 
		
	}
}