package step6;
class Animal {
	public Animal() {}
	public void eat() {
		System.out.print("먹다");
	}
}
class Rabbit extends Animal {
	public Rabbit() {
	}
	public void eat() {
		System.out.print("채소");
		super.eat(); 
	}
}
class Tiger extends Animal {
	public Tiger() {}
	@Override
	public void eat() {
		System.out.print("고기");
		super.eat(); // super.부모의메서드 호출
	}
}
public class TestOverriding1 {
	public static void main(String[] args) {
		Rabbit r = new Rabbit();
		r.eat(); // 채식 먹다
		Tiger t = new Tiger();
		t.eat(); // 고기 먹다
	}
}
