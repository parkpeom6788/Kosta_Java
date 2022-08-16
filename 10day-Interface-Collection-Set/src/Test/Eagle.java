package Test;

public class Eagle extends Bird {

	public void hunt() {
		System.out.println("사냥 하다");
	}
	@Override
	public void fly() { // Flyer 의 추상메서드를 구현한 Bird의 메서드 재정의
		System.out.println("독수리 하늘을 날다");
	}
	@Override
	public void fly2() { // interface의 default 메서드 재정의
		System.out.println("interface의 default 메서드 재정의");
	}
}
