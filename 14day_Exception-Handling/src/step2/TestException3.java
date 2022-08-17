package step2;

import java.util.ArrayList;

public class TestException3 {
	
	public static void main(String[] args) {
		// TestException1 처럼 Exception 을 고의로 발생시켜 비정상 종료되는 예제
		// TestException4 에서 Exception Handling( 예외 처리 )
			
		ArrayList<String> list = new ArrayList<>(); // 제네릭 : 타입지정 -> 별도의 캐스팅 절차 간소화
		list.add("짜장면"); // 0
		list.add("탕수육"); // 1
		
		// 사이즈를 넘어섰을때 JVM이 알려줌 
		System.out.println(list.get(2));  // JVM이 실행할때 알수있는 에러 
		System.out.println("정상수행");
	}
}
