package step5_test;

import step4_test.Friend;

public class TestChangeObject {
	
	public static void main(String[] args) {
		Friend f1 = new Friend("황희찬",22);
		Friend f2 = new Friend("정우영",31);
		
		f1=f2; // 서로 같은 주소를 가리키게된다.
		
		System.out.println(f1.getName() + " "+f1.getAge());
		System.out.println(f2.getName() + " " + f2.getAge());
		f1.setName("아이유");
		System.out.println(f1.getName() + " " + f1.getAge());
		System.out.println(f2.getName() + "  " + f2.getAge());
	}
}
