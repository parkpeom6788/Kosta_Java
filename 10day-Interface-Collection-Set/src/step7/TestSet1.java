package step7;

import java.util.TreeSet;
// Set 계열 자료구조체를 이용해보는 예제
public class TestSet1 {	
	public static void main(String[] args) {
		// <>  제네릭 : 일관성이 있는 데이터만 들어오게 함 
		// <E> : Generic 을 권장 , Set 자료구조에 등록된 요소의 타입을 지정 
		TreeSet<String> set = new TreeSet<String>(); // TreeSet은 중복을 인정하지 않고 내부 정렬
		set.add("아이유"); 
		set.add("손흥민");
		set.add("아이유"); // Set 계열은 중복을 인정하지 않는다
		// 만약 Generic 을 사용하지 않으면 아래와 같이 일관성이 없는 데이터도 추가 가능
		// set.add(22); // error : Generic 이 String 으로 명시되어 문자열 요소만 가능함 
		set.add("강하늘");
		System.out.println(set.size()); // 3
		System.out.println(set.toString()); // treeset은 toString이 재정의 되어 있다
		
	}
}
