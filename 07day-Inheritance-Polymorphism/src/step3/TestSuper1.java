package step3;

class Parent{
	String name = "부모이름";
}
class Child extends Parent{
	String name = "자식이름";
	public void printInfo() {
		System.out.println(name);
		System.out.println(this.name); // 위와 동일한 표현 this : 현재 자신의 객체를 가르키는 자바 예약어 
		System.out.println(super.name); // super : 부모를 가르키는 자바 예약어 
	}
}
public class TestSuper1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.printInfo();
	}
}
