package step5_test;

import step1_test.Bird;

public class Eagle extends Bird {
	
	public void hunt() {
		System.out.println("사냥하다");
	}

	@Override
	public void fly() {
		System.out.println("독수리가 날다");
	}
}
