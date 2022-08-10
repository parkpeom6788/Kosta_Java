package step7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

//Tree Set : 중복을 인정하지 않고 정렬 기능 , 정수형 요소를 저장해서 테스트 
// 로또를 만들때는 TreeSet 이 가장 낫다 
public class TestSet3 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(); // 제네릭에는 레퍼런스타입만 가능하다 
		//	 set.add("하나"); error Generic 이 Integer로 명시되어 정수 요소만 가능하다 
		// 1 ~ 45까지 숫자 이므로 
		set.add(11);
		set.add(5);
		set.add(9);
		set.add(33);
		set.add(44);
		set.add(7);
		System.out.println(set.toString()); // TreeSet 이므로 정렬되어 출력됨
		
	}
}
