package step5;

public class Person extends Animal {
	public Person() {}
	@Override
	public void eat() {
		System.out.println("사람이 수저로 먹다");
	}
	//Person 의 독자적인 메서드
	public void study() {
		System.out.println("사람이 공부하다");
	}
}
