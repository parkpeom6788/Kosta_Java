package step1;
// private 상속받은 부모의 멤버(속성,기능)라도 private 접근제어자가 명시된
// 멤버는 자식에서 사용불가 ( 부모 자식 관계라도 클래스가 다르기 때문)

class Parent {
	private void test() {}
	public void test2() {
		test(); // private test method는 자신의 클래스 내부에서만 사용가능 
	}
}
class Child extends Parent { // Parent 를 상속받는다
	
	public void test3() {
		test2(); // 상속받았고 public metohd 이므로 사용가능
//		test(); // compole error 상속받았더라도 private 접근제어자이므로 사용 불가 
	}
}
public class TestInheritanceReview {
	public static void main(String[] args) {
		Child c = new Child();
		c.test2();
	}
}
