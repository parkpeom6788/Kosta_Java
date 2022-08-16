package step3;
// abstract class 는 직접 객체화 될수 없고 부모 클래스의 역할에 집중  -> abstract class이면 상속을해서 쓰라는 것임 
abstract class Parent { // 추상 클래스 = 부모로써 역할에 집중한다 
	int money  = 100; 
	public Parent() {
		super(); // Object 생성
		System.out.println("Parent 객체 생성");
	}
}
class Child extends Parent {
	Child() {
		super();
		System.out.println("Child 객체 생성");
	}  
}
public class TestAbstract1 {
	public static void main(String[] args) {
		//Parent p = new Parent(); // compile error : abstract class는 직접 new해서 객체화(인스턴스화) 할 수 없다 
		Child c  = new Child(); // Object - > 부모 -> 자식 
											// 자식을 통해  super()를 통해 객체 생성이 가능하다
		System.out.println(c.money); // 상속받은 money 사용 가능
	}
}
