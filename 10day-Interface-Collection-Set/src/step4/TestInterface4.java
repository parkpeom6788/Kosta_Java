package step4;
// 한 눈에 문법을 확인하기 위해 하나의 파일에 작성
// 자바 상속 및 인터페이스 문법 확인을 위한 예제
class A{}
class B{}
//class C extends A , B{} 여러개의 클래스를 상속받을 수 없다 
interface Ex1{
					// 필드 -> 상수 
	void e1(); // 메서드 -> public abstract 추상 메서드 
}
interface Ex2{
	void e2();
}
class  C implements Ex1 , Ex2{ // success : 자바 클래스는 다양한 인터페이스를 구현할 수 있다. 다양한 계층구조 형성 -> 다형성 적용 
	
//	void e2() {} error 상위 메서드의 접근제어자보다 좁아지면 안됨
	@Override
	public void e1() {}
	public void e2() {}
}
// 인터페이스는 다중상속이 가능하다 -> 즉 추상메서드들을 물러받음
interface Ex3 extends Ex1 , Ex2 { // 두개의 추상메서드를 물러받음 
	void e3();
}
class D implements Ex3 { // D는 3개의 추상메서드를 구현해야 한다. 
	@Override
	public void e1() {
	}
	@Override
	public void e2() {
	}
	@Override
	public void e3() {
	}
}
// D class 가 implements 한 Ex3 를 별도로 implements 하지 않아도 Ex3 계층구조에 편입됨
class E extends D { 
	
}
public class TestInterface4  {
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d);
		// 상위 인터페이스 타입으로 하위 객체를 참조할 수 있다.
		Ex3 e3 = new D();
		e3.e1(); e3.e2(); e3.e3(); // 실행 가능
		Ex2 e2 = new D(); // Ex3가 Ex2 인터페이스를 상속받았으므로 가능
		e2.e2();
		// E class 가 extends 상속받은 D class 에서 implements  Ex3 를 했으므로 아래와 같이 
		// Ex3 인터페이스 타입으로 E 객체를 참조할 수 있다.
	
		// 즉 , 상속 상태에 부모가 implements 하면 자식은 implements 안해도됨
		Ex3 e = new E();
		e.e3();
		
	}
}
