package step2;

// 테스트를 위해 하나의 파일에서 여러 클래스 정의
// 다형성을 적용하지 않은 예제 , step3 과 비교해본다
// 상품의 종류가 추가될수록 처리하는 쇼핑카트의 메서드가 함께 추가되는 비효율적인 구조 
// 결합도가 높은 구조 유지보수성이 낮다 
class NoteBook{}
class SmartPhone{}
class Food{}
class ShoppingCart{
	public void put(NoteBook n) {
		System.out.println(n.toString() + " 추가");
	}
	public void put(SmartPhone s) { // 상품의 종류가 추가되면 새로 메서드를 오버로딩 해서 처리 
		System.out.println(s.toString() + " 추가");
	}
	public void put(Food f) {
		System.out.println(f.toString() + " 추가");
	}
}
public class TestPolymorphism2 {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.put(new NoteBook());
		cart.put(new SmartPhone());
		cart.put(new Food());
		
	}
}

