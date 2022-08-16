package step3_test;

public class VariableScopeExam {
	int i; // 인스턴스 변수
	static int j; // 클래스 변수
	public VariableScopeExam() {
		int i = 1; // 지역변수 
		System.out.println(i); // 지역변수는 반드시 명시적 초기화를 해줘야 한다.
	}
	public void test1() {
		int i = 2;
		System.out.println(i); // 2
		System.out.println(this.i); // 0
	}
	public void test2(int i) {
		System.out.println(this.i); // 0
		System.out.println(i);  // 7
		int k = 8;
		System.out.println(k); // 8
	}
	public void test3(int i) { // 8넘어옴 
		int y = 0;
//		System.out.println(k);
		if(i > 0) {
			int x = 1; // 가까운 블록{} 내에서만 사용 가능 
			System.out.println(x); // 1
			y = 1;
		}
//		System.out.println(x);
		System.out.println(y); // 1
	}
}
