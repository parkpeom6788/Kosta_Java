package step1;
// Bird 클래스는 Flyer 인터페이스를 구현한다
public class Bird implements Flyer { // 구현 implements , 상속 extends 
	// 상위 인터페이스의 abstract 메서드는 반드시 구현해야 한다 
	// 만약 구현하지 않으면 Bird class 가 abstract class 가 되어야 한다 -> 객체화 될 수 없음
	@Override
	public void fly() { 
		System.out.println("새가 날다");
	}
}