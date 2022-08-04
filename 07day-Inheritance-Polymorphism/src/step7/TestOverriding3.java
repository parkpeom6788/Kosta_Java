package step7;

// 메서드 오버라이드 문법 확인 
class Animal {
	public void eat() {}
	protected void sleep(){}
}
class Person extends Animal {
	//protected void eat() { // 부모 메서드의 접근 제어자 보다 범위가 좁아지면 안됨
	//}
	public void sleep() { // 오버라이딩시 부모 메서드 접근제어자 보다 범위가 넓어지는 것은 문제 없음
	}
	/*
	public int eat() { // error : 오버라이드 문법에 의해 리턴타입은 같아야 한다.
		return 1;
	}
	*/
//	@Override 적으면 문법체크를 해서 오버로딩된 코드가 오류가 된다.
	public void eat(int i) { // 매개변수가 다른 메서드 오버로딩 이다.
		
	}
}
public class TestOverriding3 {
	
}
