package step5;
/*
 *  Polymorphism 다형성 적용시 
 *  Object Casting 에 대한 예제 
 */
public class TestPolymorphism5 {
	public static void main(String[] args) {
		// 부모 타입의 변수로 자식 객체 참조
		Animal a = new Person();
		// 상속받은 Animal 부모 메서드 접근해 사용 가능
		a.sleep();
		// 부모 메서드를 오버라이딩한 자식의 메서드 사용 가능
		a.eat();
		// error 자식의 독자적인 멤버(속성,기능)는 접근 불가
		// a.study();
		// 자식 객체의 독자적인 멤버에 접근하기 위해서는
		// Object Casting이 필요 -> Object Down Casting
		
		if(a instanceof Person) { // instanceof 객체 타입 비교 is a 관계 일때 true 
												// 
			// Object Up casting
			((Person)a).study(); // 다운 캐스팅(자식타입으로 내림) 해서 접근하면 됨
			Person p = new Person();
			Animal ani = p; // 업 캐스팅(자식타입을 부모타입으로 바꿈)
			ani.eat();
		}
		Person p;
	}
}
