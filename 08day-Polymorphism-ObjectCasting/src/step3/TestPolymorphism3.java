package step3;

// 다형성(Polymorphism) 적용하기 위해 계층 구조 형성한다 
class Product{
	
	public Product() {
		
	}
}
class NoteBook extends Product{}
class SmartPhone extends Product{}
class Food extends Product{}

// 다형성 적용되므로 put 장바구니에 추가 하는 메서드 
class ShoppingCart {
	// 부모 타입의 매개변수에 다양한 자식 객체들을 전달받을 수 있다.
	// 새로운 상품이 추가되어도 별도의 메서드 추가 작업은 필요없다
	// 다형성을 이용하여 유지보수성을 향상 시킨다
	public void put(Product p) {
		System.out.println(p.toString() + "장바구니에 추가");
	}

	// 상품을 담음 
	public void put2(Product[] p) {
		
	}
	
}
public class TestPolymorphism3 {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.put(new NoteBook()); // 다양한 자식 객체를 전달할 수 있다.
		cart.put(new SmartPhone());
		cart.put(new Food());
		
		//----------------------
	}
}

