package step1_test;

public class TestInterface1 {
	public static void main(String[] args) {
		// 상위 인터페이스 타입의 변수로 하위 객체를 참조 할수 있다.
		Flyer f = new Bird();
		f.fly();
		Flyer f2 = new AirPlane();
		f2.fly();
		Flyer f3 = new SuperMan();
		f3.fly();
		// Flyer 인터페이스의 static final 상수에 접근 
		System.out.println(Flyer.ID);
		// Flyer.ID = "angel"; // final 상수 이므로 재할당 불가 
	}
}
