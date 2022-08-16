package step2_test;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age ) {
		this.name = name;
		this.age = age;
	}
	public Person(String name) {
		this.name = name;
	}
	
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
