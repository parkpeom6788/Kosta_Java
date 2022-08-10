package step5;

import step1.Bird;
public class Eagle extends Bird {
	public void hunt() {
		System.out.println("사냥하다");
	}
	// Bird의 fly를 자신에 맞게 재정의 : 오버라이딩
	@Override
	public void fly() {
		System.out.println("독수리가 날다");
	}
}
