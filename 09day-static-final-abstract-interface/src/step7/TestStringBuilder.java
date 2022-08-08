package step7;

public class TestStringBuilder {
	public static void main(String[] args) {
		// 문자열 클래스 StringBuilder 특성 : 가변
		StringBuilder name = new StringBuilder("아이유");
		System.out.println(name); //아이유
		System.out.println(name.append("가수")); // 문자열에 가수 추가
		System.out.println(name); // 아이유 가수 , 문자열 자체가 변경 ( 가변 ) 
		System.out.println();
		
	}
}
