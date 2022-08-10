package step7_test;

import java.util.TreeSet;

public class TestSet3 {
	// TreeSet : 중복을 인정하지 않고 정렬 기능 -> 오름차순 
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(11);
		set.add(5);
		set.add(9);
		set.add(33);
		set.add(44);
		set.add(7);
		System.out.println(set.toString());
	}
}
