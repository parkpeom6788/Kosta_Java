package step8;

// 생성자를 정의하고 사용하는 연습 예제
public class TestConstructor4 {
	public static void main(String[] args) {
		
		Food f = new Food("테라","하이트진로",1410);
		System.out.println(f.getName()); //테라
		System.out.println(f.getMaker()); // 하이트진로 
		System.out.println(f.getPrice()); // 1410
		// Food class에서 필요한 구성요소 
		// instance variable : 3개
		// 생성자 1개
		// getter 3개 
		Food f2 = new Food(f);
		System.out.println(f);
		System.out.println(f2);
	}
}
