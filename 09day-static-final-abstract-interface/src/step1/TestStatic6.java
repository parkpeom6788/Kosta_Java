package step1;

public class TestStatic6 {
	int i;
	public static void main(String[] args) {
//		System.out.println(i); static 안에서는 인스턴스변수 접근 x
		System.out.println(new TestStatic6().i); // 0 객체 생성이 반드시 필요함 static -> non static 
		// java api 에서 제공하는 static 메서드 활용해보기 
		// System.out out은 static 
		String s1 = "1";
		String s2= "9";
		System.out.println(s1+s2); // 문자열 이므로 19
		// 정수형으로 변환
		// parseInt 메서드는 static 이므로 클래스명.멤버 메서드로 접근
		int i = Integer.parseInt(s1); // 문자열을 정수로 
		int j = Integer.parseInt(s2);
		System.out.println(i+j); // 정수 연산 결과 10
		
	}
}
