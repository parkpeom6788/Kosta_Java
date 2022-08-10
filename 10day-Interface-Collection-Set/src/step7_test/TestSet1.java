package step7_test;

import java.util.TreeSet;

public class TestSet1 {
// Set 계열 자료구조체를 이용해 보는 예제	
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("아이유");
		set.add("손흥민");
		set.add("아이유"); // Set 계열은 중복을 인정하지 않는다
		set.add("강하늘");
		System.out.println(set.size()); // 3
		System.out.println(set.toString()); // treeSet 은 toString 이 재정의 되어있다
	}
}
