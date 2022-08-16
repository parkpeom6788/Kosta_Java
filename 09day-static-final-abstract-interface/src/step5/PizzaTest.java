package step5;
// 싱글톤 디자인 패턴
class SingleTon {
	private SingleTon singleton = new SingleTon();
	private SingleTon() {
	}
	public SingleTon getInstacne() {
		return singleton;
	}
}
// 템플릿메서드 패턴 
abstract class  Pizza {
	protected void makedow() {
		System.out.println("도우만듬");
	}
	protected void gubda() {
		System.out.println("굽다");
	}
	protected void slice() {
		System.out.println("자르다");
	}
	protected void packing() {
		System.out.println("포장");
	}
	protected abstract void topping();
	public void button() {
		makedow(); // 부모 실행
		topping(); // 자식 실행
		gubda(); // 자식 실행
		slice(); // 자식 실행
		packing(); // 자식 실행 
	}
}
class Bulgogi extends Pizza {
	@Override
	public void topping() {
		System.out.println("불고기를 넣는다");
	}
}
class SeaFood extends Pizza {
	@Override
	public void topping() {
		System.out.println("해산물 넣는다");
	}
}

public class PizzaTest {
	public static void main(String[] args) {	
		Pizza p = new Bulgogi();
		p.button();
		System.out.println("-------------------");
		Pizza p2 = new SeaFood();
		p2.button();
	}
}
