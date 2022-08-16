package step2;
import step2.service.AccessModifierEaxm;
public class TestInheritance3 extends AccessModifierEaxm {
	public void accessTest() {
		test1(); // public 
		test2(); // protected 
//		test3(); // default
//		test4(); // private
	}
}
class Test {
	public void accessTest() {
		AccessModifierEaxm ex = new AccessModifierEaxm();
		ex.test1(); // public 
//		ex.test2(); 상속관계가 아니므로 접근 불가 
//		ex.test3(); 동일 패키지가 아니므로 접근 불가
//		ex.test4(); 클래스 내부에서만 접근 가능 
		ex.test5();// public
	}
}
