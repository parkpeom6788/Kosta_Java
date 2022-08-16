package step4;

class Animal {
	int age;
	// Animal() 자동삽입X 
	public Animal(int age) {
		this.age = age;
	}
	public Animal() {}
}

class Person extends Animal {
	public Person() {
		super(50); // 부모의 기본생성자를 호출한다.
	}
}

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		
	}
}
