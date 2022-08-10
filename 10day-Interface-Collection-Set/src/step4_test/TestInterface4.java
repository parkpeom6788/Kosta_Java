package step4_test;
class A{}
class B{}
interface Ex1 {
	// 필드 -> 상수 
	public abstract void e1(); // 추상메서드 생략됨 
}
interface Ex2 {
	void e2();
}
class C implements Ex1 , Ex2 {
	@Override
	public void e1() {}
	public void e2() {}
}
// 인터페이스는 다중 상속이 가능하다 -> 즉 추상메서드들을 물러받음
interface Ex3 extends Ex1 , Ex2 {
	void e3();
}
class D implements Ex3 {
	@Override
	public void e1() {
	}
	public void e2() {
	}
	public void e3() {
	}
}
class E extends D {
		
}
public class TestInterface4 {
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d);
		
		Ex3 e3 = new D();
		e3.e1(); e3.e2(); e3.e3(); 
		
		Ex2 e2 = new D(); // Ex2 에 e2 하나만 추상메서드 이므로
									// e2() 만 호출 가능 함 
		e2.e2();		
	}
}
