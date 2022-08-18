package step1;
public class TestException2 {
	public static void main(String[] args) {
			System.out.println("프로그램 실행시작");
			String name="아이유";
			name = null; // 고의로 null를 할당해 Exception 발생되도록 해본다
		try {
			System.out.println(name.length() + "자로 이름이 구성됨"); // 실행 내용
		} catch(NullPointerException ne) {
			System.out.println(ne.getMessage() + "예외처리 => 이름 정보가 존재하지 않아 길이를 구할 수 없습니다.");
			ne.printStackTrace(); // Exception 메세지와 발생경로를 출력
		}
		
		// catch 문에 잡히고 난 뒤 실행 
		System.out.println("프로그램 정상 수행");
	}
}
