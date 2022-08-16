package step1;

class Parent {
	private void test() {	}
	public void test2() {
		test(); // private test method는 자신의 클래스 내부에서만 사용 가능
	}
}
class Child extends Parent {
	public void test3() {
		test2();
	}
}
public class TestInheritanceReview {
	public static void main(String[] args) {
		Child c = new Child();
		c.test2();
	}
}
