package step1_test;

import java.util.ArrayList;

public class TestList1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("아이유");
		list.add("손흥민");
		list.add("아이유");
		System.out.println(list.size()); // 3 중복 허용
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		
		System.out.println(list.contains("손흥민"));
		
		// 마지막 요소 삭제
		System.out.println(list.remove(list.size()-1)); 
		System.out.println(list.toString());
		System.out.println("변경 대상 요소 : " + list.set(1, "황의조"));
		System.out.println(list);
		list.add("이강인");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + " ");
			/*
			 * 아이유
			 * 황의조
			 * 이강인
			 */
		}
		list.clear();
		System.out.println(list);
	}
}
