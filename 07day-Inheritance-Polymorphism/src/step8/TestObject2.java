package step8;

/*
 * java.lang.Object 의 toString 메서드를 오버라이드하여 
 * 객체의 주소값 대신 실제 내용값(속성정보)을 반환하여 출력해보는 예제 
 */
class Person { // extends Object
	// Person() { super(); } 
	String name;
	int age;
	public Person() {
		super(); // Object 생성자 호출 
	}
	public Person(String name, int age) {
		super(); // Object 생성자 호출 
		this.name = name;
		this.age = age;
	}
	// 부모인 Object class 의 toString() 을 오버라이드 하여 주소값 대신
	// 객체의 정보를 반환하게 한다.
	public String toString() {
		return "name :"+  name + " age : " + age;
//		super().toString()   Person 클래스꺼로 나옴
	}
}
public class TestObject2 {
	public static void main(String[] args) {
		Person p = new Person("아이유",22);
		System.out.println(p.toString()); // Object.toString() -> 재정의 해서 원하는 결과값으로 도출시킴 
	}
}