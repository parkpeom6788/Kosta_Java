package step4;

import java.util.ArrayList;

/*
 * try catch finally review
 * 실행결과를 예상해본다
 */
public class TestReviewException {
	public static void main(String[] args) {
			System.out.println("A");
		try {
			ArrayList<Integer> list = new ArrayList<>();
			System.out.println(list.size()); // 0
			System.out.println(list.get(0)); // IndexOutOfBoundsException 발생
			System.out.println("B");
		} catch(NullPointerException ne) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
}











