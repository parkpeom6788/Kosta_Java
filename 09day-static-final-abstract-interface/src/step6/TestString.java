package step6;
public class TestString {
	public static void main(String[] args) {
		// 문자열 클래스 String 특성 : 불변 
		String name = "아이유";
		System.out.println(name); // 아이유 
		System.out.println(name.concat("가수")); // 아이유가수 문자열이 새로 생성
		System.out.println(name); // 불변 , 여전히 아이유 
		// String 문자열을 여러 변수에 의해 공유되어 사용되도록 구성 
		String name2 = "아이유"; // 문자열 새로 생성하지 않고 literal pool(문자열 저장영역) 에
		// 이미 만들어진 아이유 문자열을 공유해 사용함으로 메모리를 절약
		System.out.println(name2); // 아이유
		
		// String class 에서 많이 사용되는 메서드를 테스트 
		// 같은지 비교할 때 == 이 아니라 String 의 equals 메서드를 이용해야 한다 
		System.out.println(name == name2); // true
		String name3 = new String("아이유");
		System.out.println(name == name3); // 주소값 비교하므로  false , 정확한 비교가 되지 않는다 
		System.out.println(name.equals(name3)); // 실제값 비교 
		System.out.println(name.startsWith("아이")); // "아이"로 시작하는가 ?
		String file = "버터.mp3";
		System.out.println(file.endsWith(".mp3")); // .mp3 확장자로 끝
		 
		System.out.println(name.contains("이")); // name 문자열에 이 가 존재하면 true 
		
		StringBuilder info = new StringBuilder("뻐이장가가니");
		System.out.println(info.reverse());
		
	}
}
