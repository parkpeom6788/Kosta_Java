package step4;

import java.util.ArrayList;


public class TestReviewException {
	public static void main(String[] args) {
			
			System.out.println("A");
		try {
			ArrayList<Integer> list = new ArrayList<>();
			System.out.println(list.size());
			System.out.println(list.get(0)); // IndexOutOfBoundsException
			System.out.println("B");
		} catch(NullPointerException ne) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
}











