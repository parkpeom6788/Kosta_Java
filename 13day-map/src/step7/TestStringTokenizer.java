package step7;

import java.util.StringTokenizer;

public class TestStringTokenizer {
	
	public static void main(String[] args) {
		
		String info = "짬뽕 탕수육 칭따오맥주 양꼬치";
		StringTokenizer stk = new StringTokenizer(info); // 구분자를 별도로 주지 않으면 공란을 중심으로 분리
		
		// 토큰 - 공백 
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken()); // String 반환 
		}
		System.out.println("*************************");
		String friend = "김규빈,김동훈,김민석,김예린,김윤수,김훈진"; // , 를 구분자로 문자열 분할
		StringTokenizer stk2 = new StringTokenizer(friend,",");
		
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());  // String 반환 
		}
	}
}
