package step8;

//별도의 상속관계가 명시되지 않으면 extends Object로 자동 처리
//java.lang.Object : 모든 클래스의 최상위 클래스
class Car { // class Car extends Object {
	public Car() {
	}
}

public class TestObject1 {
	
	public static void main(String[] args) {
		
	Car c = new Car();
	Tiger t = new Tiger();
	System.out.println(c); // toString() 생략됨 
	System.out.println(c.toString()); // 힙의 주소값 
	System.out.println(t.toString()); // 힙의 주소값 
	System.out.println(c.getClass().getName()); // c 변수가 참조하는 객체의 클래스명을 확인
																			// 패키지.클래스
	}
}
