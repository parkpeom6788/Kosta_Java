package step2.test;

import java.nio.channels.AcceptPendingException;

import step2.service.AccessModifierExam;
/*
 * protected 접근 제어자 테스트 : 접근하여 사용 가능 여부를 확인하는 예제
 * 													기본적으로 동일한 패키지 내에서만 접근 가능 
 * 													상속을 받으면 ( 상속 관계 ) 
 * 													다른 패키지라도 접근해 사용 가능  	 
 */
public class TestInheritance3 extends AccessModifierExam {
	public void accessTest() {
		test1(); // public method는 다른 패키지에서 접근 가능
		test2(); // protected method 는 상속 받았을때는 다른 패키지라도 접근 가능
//		test3(); // default 다른패키지 접근 불가, 상속받아도 같은패키지에서만
//		test4(); // private 상속받아도 클래스 내부 에서만 접근 가능 
	}
}
// 상속을 받지 않은 테스트 
class Test {
	public void accessTest() {
		AccessModifierExam ex = new AccessModifierExam();
		ex.test1(); // public 이므로 접근 가능
		ex.test5(); // public  이므로 접근 가능
//		ex.test2(); // error  protected 는 상속관계 에서만 접근 가능 
//		ex.test3(); // error default 다른패키지에서는 접근 불가
//		ex.test4(); // error 같은 클래스 내에서만 
	}
}
