package step5_test;

import step6.Car;

// import : 다른 패키지의 자원을 이용할 때 사용
public class TestAccessModifier {
	public static void main(String[] args) {
		// 다른 패키지 step6의 Car 객체를 생성해
		// 인스턴스 변수에 접근해본다
		Car c = new Car();
		System.out.println(c.model); // -> 모든 지역 접근 가능
		//protected 이므로 접근 불가 
//		System.out.println(c.model2); -> 같은패키지 또는 상속관계 
		//default 이므로 접근 불가
//		System.out.println(c.model3); -> 같은 패키지에서만 접근 가능
		// private 이므로 접근 불가
//		System.out.println(c.model4); -> 클래스 내 에서만 접근 가능 
	}
}
