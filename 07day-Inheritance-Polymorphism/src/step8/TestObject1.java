package step8;

// 별도의 상속관계가 명시되지 않으면 extends Object로 자동 처리
// java.lang.Object : 모든 클래스의 최상위 클래스
class Car { // class Car extends Object {
	public Car() {
		
	}
}
public class TestObject1 {
	public static void main(String[] args) {
		Car c = new Car();
		Tiger t = new Tiger();
		System.out.println(c); // println 은 object  class의 메서드 toString() 호출 println() 메서드 내부에서 toString()을 호출해 출력 
										 // toString이 getClass().getName() + '@' + Integer.toHexString(hasCode()) 를 호출함 
										 //	 즉 , 객체의 주소값을 반환해 준다.
										 // 자식에서 object 클래스의 toString() 를 재정의 해서 쓸수있다 ! 
		System.out.println(c.toString()); // step8.Car@15db9742
		System.out.println(t.toString());
		// java.lang.Object 의 getClass() 를 이용해 c 변수가 참조하는 객체의 클래스명을 확인
		System.out.println(c.getClass().getName()); // 패키지.클래스
		
	}
}
