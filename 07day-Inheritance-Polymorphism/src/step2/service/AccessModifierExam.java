package step2.service;

public class AccessModifierExam {
	
	protected int a = 10;
	
	public void test1() {}
	protected void test2() {}
	void test3() {}
	private void test4() {} // 노란색이 없는것이 클린 코드 
	// warning message 를 보이지 않게 하기 위해
	// 내부에서 private method test4를 사용한다
	public void test5() {
		test4();
	}
}

