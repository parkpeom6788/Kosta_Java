package step5;

import step4.Friend;
/*
 * 	객체의 주소값 변경 테스트 
 * 	실행 결과를 예상해본다
 */
public class TestChangeObject {
	public static void main(String[] args) {
		Friend f1 = new Friend("황희찬",22); // import 단축키 ctrl + shift + o
		Friend f2 = new Friend("정우영",31); 
		
		f1 = f2; // 할당 f2가 가리키고있는걸 f1도 가리키게됨 (f2에 저장된 객체 주소값을 f1에 할당)
		// 실행결과 예상
		System.out.println(f1.getName() + " " + f1.getAge()); // 정우영
		System.out.println(f2.getName() + " " + f2.getAge()); // 정우영 
		f1.setName("아이유");
		// 실행결과 예상
		System.out.println(f1.getName() + " " + f1.getAge()); // 아이유
		System.out.println(f2.getName() + " " + f2.getAge()); // 아이유
	}	
}
