package step1;

public class TestPolymorphism1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		// compile error
		// 타입이 다르므로 Car 객체를 
		// Animal 타입의 변수에 참조시킬수 없다 
		// Animal c = new Car(); // error
		// 아래는 가능 -> 다형성 지원
		Animal a2 = new Person();
		// Person 자식 객체를 Animal 부모 타입의 
		// 변수에 참조시킬수 있다
		a2.eat();  // 오버라이드된 Person의 eat 메서드 실행 
		Rabbit r;
		// 부모타입의 변수에 자식객체를 참조 할 수 있다.
		Animal a3 = new Rabbit(); // Rabbit r = new Rabbit() 하면 되지만 부모타입으로 
		// 참조가 가능 하다는 것을 확인한 거임 
		a3.eat(); // 오버라이딩된 Rabbit의 eat 메서드 실행 
		// 자식 객체를 부모 타입의 변수로 참조시켜 보는 연습을 하는 이유는 step2예제에서 확인
		
		
	}
}
