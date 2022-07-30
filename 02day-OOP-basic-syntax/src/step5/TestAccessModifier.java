package step5;

// import : 다른 패키지의 자원을 이용할 때 사용 
import step6.Car;

public class TestAccessModifier {
	public static void main(String[] args) {
		// 다른 패키지 step6의 Car 객체를 생성해
		// 인스턴스 변수에 접근해본다.
		Car c = new Car();
		System.out.println(c.model);
		// protected 이므로 접근 불가 
//		System.out.println(c.model2);
		// default 이므로 접근 불가
//		System.out.println(c.model3);
		// private 이므로 접근 불가
//		System.out.println(c.model4);
		
	}
}
