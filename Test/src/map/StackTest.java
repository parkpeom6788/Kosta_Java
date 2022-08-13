package map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
public class StackTest {
	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		stk.add("김철수");
		stk.add("이영희");
		stk.add("박영수"); // Stack에 값 추가 (나중에 넣은게 먼저 나옴)
		
		System.out.println("stack 안에 이영희 들었는지 확인 : " + stk.contains("이영희"));
		
		System.out.println("Stack pop 시 값 : " + stk.peek());
		// i 번째 인덱스가 뭐가 들었나 확인하기
		System.out.println("0번째 인덱스 확인 : " + stk.elementAt(0));
		// 특정 값이 어느 인덱스에 들었나 확인
		System.out.println("특정 값의 인덱스 확인 : " + stk.indexOf("이영희"));
		
		HashMap map = new HashMap();
		
		Set set  = map.entrySet();
		for(Map.Entry me : set) {
			
		}
	}
}
