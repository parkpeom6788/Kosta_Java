package step2;

public class Person {
	// name 인스턴스 변수의 데이터 형은 참조형이다 
	// 문자열 저장시 참조형인 String 을 명시한다 
	private String name;
	// age 인스턴스 변수의 데이터 형은 기본형이다 
	// 정수형 데이터를 저장하기 위해 int 형을 이용 
	private int age;
	public Person() {}
	public Person(String name, int age) {
		this.name = name; // 인스턴스 변수(멤버변수) 와 지역변수(매개변수) 를 구분한다 
		this.age = age;
	}
	// 인스턴스 복사 
	public Person(Person p) {
		this.name = p.name;
		this.age = p.age;
	}
	// getter / setter 단축키 alt + shift + s 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
