package step7_test;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class TestSet2 {
	// LinkedHashSet : 순서를 인정하면서 중복을 인정하지 않음 , 입력 순서에 따라
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("아이유");
		set.add("손흥민");
		set.add("아이유");
		set.add("강하늘");
		System.out.println(set.size()); // 3
	
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			String s = (String)iterator.next();
			System.out.println(s + " ");
		}
	}
}
