package step2;

import java.util.ArrayList;

public class TestException3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("짜장면"); //0
		list.add("탕수육"); //1
		
		// 사이즈를 넘어섰을때 JVM이 알려줌
		System.out.println(list.get(2)); // JVM 이 실행할때 알수있는 에러
		System.out.println("정상수행");
	}
}
