package step5;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		// Stack 자료구조체의 특징을 파악하는 예제
		Stack<String> stack = new Stack<String>();
		stack.add("희망이");
		stack.add("봄이");
		stack.add("쿠키");
		// 희망이 봄이 쿠키 순으로 들어간다 
//		System.out.println(stack.pop()); // 가장 최근에 추가된 요소가 추출된다. LIFO(Last In First Out)
//		System.out.println(stack.pop()); 
		System.out.println(stack.isEmpty()); // 비어있냐 안비어있냐 
		// 비어있으면 true , 아니면 false 
		
		// while 문을 이용 isEmpty() , pop() 을 활용해서 최근 추가된 요소부터 마지막까지 모두 추출
		while(stack.isEmpty() != true) {
			stack.pop();
		}
		System.out.println(stack.isEmpty());
	}
}
