package step6;
class Animal {
	public void eat() {
		System.out.println("먹다");
	}
}
class Rabbit extends Animal {
	// 메서드 오버라이딩 : 부모의 상속받은 메서드를 자신의 기능에 알맞게 구현부를 재정의 한다.
	public void eat() {
		System.out.print("채소");
		//부모 eat 메서드를 호출
		super.eat(); // 추가 기능을 넣어서 채소먹다를 만들어낼수 있다.
	}
}
class Tiger extends Animal {
	@Override
	public void eat() {
		System.out.print("고기");
		super.eat();
	}
}
public class TestOverriding1 {
	public static void main(String[] args) {
		Rabbit r = new Rabbit();
		r.eat(); // 채식하다
		Tiger t = new Tiger();
		t.eat(); // 고기 먹다
	}
}

