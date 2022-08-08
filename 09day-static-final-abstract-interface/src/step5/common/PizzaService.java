package step5.common;
// 하나 이상의 abstract method 가 있는 클래스는
// abstract class로 선언되어야 한다 -> 직접 객체화 될 수 없고 부모 역할에 집중 
public abstract class PizzaService {
	
	// protected 는 자식에게만 공유 
	protected  void prepare() { 
		System.out.println("도우를 만들다");
	}
	// 토핑 작업은 부모 차원에서 구현해 상속시킬 수 없는 작업 
	// 하위클래스에게 구현을 강제하기 위해 abstract method로 선언 
	protected abstract void topping(); 
	protected void bake() {
		System.out.println("굽다");
	}
	protected void cutting() {
		System.out.println("자르다");
	}
	protected void boxing() {
		System.out.println("포장하다");
	}
	/*
	 *  템플릿 메서드 : 작업공정의 구조 , 틀 , 뼈대 를 자식 클래스에 상속시킴 
	 *  						작업 공정의 표준화 및 생산성 향상에 기여 
	 */
	public void makePizza() {
		prepare();
		topping();
		bake();
		cutting();
		boxing();
	}
}
