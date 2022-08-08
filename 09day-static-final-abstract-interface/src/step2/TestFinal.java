package step2;

class FinalExam {
	// 상수는 대문자로 표현하고 합성어는 _ underscore 로 연결 
	final int MY_NUMBER = 1; // final 을 명시해서 재할당 불가하게 한다 
	void test() {
		//	 MY_NUMBER = 2; final 상수이므로 재할당 불가  error
	}
	public final void test2() { // 메서드에 final 제어자를 명시 -> 자식 클래스에서 오버라이딩 불가 
	}
}
final class Parent {} // final class는 상속될 수 없다.
//class Child extends Parent {} 

public class TestFinal extends FinalExam {
// 	public void test2() { 안됨 final 메서드 -> 오버라이딩 할수 없다 
//		
//	}
}
