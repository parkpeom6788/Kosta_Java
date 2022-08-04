package step4;
/*
 * 상속 원리 : Child 가 Parent 를 상속받은 상태에서 Child 자식 객체를 생성할 경우 
 * 					super() 원리에 의에 부모인 Parent  객체부터 생성된 후 
 * 					자식 Child 객체가 생성된다. 
 */
class Parent {
	public Parent() {
		System.out.println("Parent 객체 생성");
	}
}
class Child extends Parent { // Parent를 상속받는다
		public Child() { // super() : // 부모 생성자 호출(부모 객체 생성 ) , 명시하지 않으면 컴파일시에 자동 삽입 , 무조건 첫 라인 
								// 즉 부모 객체가 메모리에 만들어지고 내것이 만들어진다. 명시해야될 경우가 더 많다 
			System.out.println("Child 객체 생성");
		}
}
public class TestSuper2 {
	public static void main(String[] args) {
		new Child();
		
	}
}
