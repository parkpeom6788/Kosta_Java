package step4;
abstract class Parent {
	int money = 200;
	public void eat() {
		System.out.println("먹다");
	}
	// class 에서 abstract method가 하나 이상 존재하면 그 클래스는 abstract 로 선언되어야 한다 
	public abstract void study(); // abstract method는 구현부 존재할수 없다
}
class Child extends Parent {
	@Override
	public void study() { // 부모의 abstract method 는 반드시 구현해야 한다.
		System.out.println("공부해!!!!");
	}
}
public class TestAddstract2 {
	public static void main(String[] args) {
		//Parent p = new Parent(); // error , abstract class 는 직접 객체화 할 수 없음
		Parent p = new Child();
		System.out.println(p.money); // 200
		p.eat(); // 먹다
		p.study(); 
	}
}
