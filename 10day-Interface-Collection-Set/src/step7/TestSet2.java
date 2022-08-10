package step7;

import java.util.Iterator;
import java.util.LinkedHashSet;
// Set 계열 : TreeSet 중복 인정하지 않고 정렬 기능 
// 				LinkedHashSet : 순서를 인정하면서 중복을 인정하지 않음 - 입력 순서를 보장 
public class TestSet2 {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("아이유");
		set.add("손흥민");
		set.add("아이유");
		set.add("강하늘");
		System.out.println(set.size()); // 3
		System.out.println(set.toString()); // 아이유 손흥민 강하늘 
		
	}
}
