package step2.service;

public class AccessModifierEaxm {
	protected int a = 10;  // 다른패키지여도 상속관계면 가능 
	public void test1() {}  // 모든 지역 접근 가능
	protected void test2() {} // 다른패키지여도 상속관계면 가능
	void test3() {} // 같은패키지 내에서만 접근 가능
	private void test4() {} // 클래스 내부에서만 접근 가능
	public void test5() { // 모든 지역 접근 가능
		test4();
	}
}
