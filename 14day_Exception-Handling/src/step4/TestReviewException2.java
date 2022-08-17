package step4;

import java.util.ArrayList;

/*
 * try catch finally review
 * 실행결과를 예상해본다
 */
public class TestReviewException2 {
	public static void main(String[] args) {
			System.out.println("A");
		try {
			ArrayList<Integer> list = new ArrayList<>();
			System.out.println(list.size()); // 0
			System.out.println(list.get(0)); // IndexOutOfBoundsException 발생
			System.out.println("B");
		} catch(RuntimeException ne) { // RuntimeException은  IndexOutOfBoundsException 의 부모다 
			System.out.println("C");
		} finally { // 오류에 관계없이 실행 
			System.out.println("D");
		}
		// catch 오류가 잡혔으면 실행 
		System.out.println("E");
	}
}











