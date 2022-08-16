package step8;

/*
 * java.lang.Object 의 toString 메서드를 오버라이드 하여
 * 객체의 주소값 대신 실제 내용값(속성정보)를 반환하여 출력해보는 예제
 */
class Person { // extends Object
	String name;
	int age;
	public Person() {
		super(); // Object 생성자 호출
	}
	public Person(String name,int age) {
		super(); // Object 생성자 호출
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "name : "  + name +  " age : " + age;
		// super().toString() Person 클래스 꺼로 나온다.
	}
}
public class TestObject2 {
	public static void main(String[] args) {
		Person p = new Person("아이유",22);
		System.out.println(p.toString()); // Object.toString() -> 재정의 해서 원하는 결과값으로 재정의 한다.
	}
}
