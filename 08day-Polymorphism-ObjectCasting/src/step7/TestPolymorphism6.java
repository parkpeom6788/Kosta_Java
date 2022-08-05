package step7;
public class TestPolymorphism6 {
	public static void main(String[] args) {
		ZooService service = new ZooService();
		service.enter(new Monkey()); // 원숭이가 나무타며 놀다 
		service.enter(new Tiger()); // 호랑이가 사냥하며 놀다 
		// 고객이 티켓을 구매하다
		// 고객이 데이트하며 놀다 
		service.enter(new Customer());  
	}
}
