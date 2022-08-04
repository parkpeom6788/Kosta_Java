package step4;
class A { // extends Object => 자동으로 삽입 ( 이후 공부 예정 ) 
	A(){//super(); -> object
		System.out.println("A 객체 생성");
	}
}
class B extends A {
	B(){ //super();
		System.out.println("B 객체 생성");
	}
}
class C extends B {
	C() {
		// super(); 반드시 첫 라인에 배치됨 명시 하지 않으면 컴파일시에 자동 삽입된다. 부모 생성자 호출해 부모 객체 생성하게 됨
		System.out.println("C 객체 생성");
//		super(); super는 반드시 첫 라인에 
	}
}
public class TestSuper3 {
	public static void main(String[] args) {
		new C();
	}
}
