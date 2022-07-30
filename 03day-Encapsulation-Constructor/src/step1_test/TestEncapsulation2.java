package step1_test;

public class TestEncapsulation2 {
	
	public static void main(String[] args) {
		Account2 a = new Account2();
		
		// a.password = "sds"; // 바로 변경 가능 (public 이므로)
		// 계좌 패스워드가 외부에 노출됨
		// null 이 출력 : 문자열 정보가 없을 때 null로 표현
		System.out.println(a.password); // null
		// private 이므로 외부에서 접근 불가
//		System.out.println(a.capsulPassword);
		// private 으로 은닉된 정보는 
		// getter 와 setter 로 접근한다
		// setter로 패스워드 정보를 할당 한다.
		a.setCapsulPassword("javaKing");
		
		System.out.println(a.getCapsulPassword()); // javaKing 출력됨 
		
	}
}
