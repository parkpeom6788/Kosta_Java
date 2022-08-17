package step1;
/**
 * 이전 예제 TestException1 : 
 * java application 실행시 jvm은 Exception (예외 ) 상황을 만나면 해당 Exception ( 아래의 경우는 NullPointerException) 을
 * 발생시킨 후 별도의 처리(핸들러)가 없다면 즉시 메세지 출력 후 비정상 종료된다. 
 * 
 * 현재 예제 TestException2 :
 * Exception Handling(예외 처리)을 통해 Exception 발생시 대처방안을 실행하고 
 * 프로그램 정상 수행되도록 한다 
 * 
 * TestException1 과 TestException2 차이는 정상 수행 여부 차이다 
 * 
 * @author KOSTA
 */
public class TestException2 {
	public static void main(String[] args) {
			System.out.println("프로그램이 실행시작");
			String name = "아이유";
			name = null; // 고의로 null를 할당해 Exception 발생되도록 해본다 
		try { // try : Exception 발생 예상영역 지정 
				System.out.println(name.length() + "자로 이름이 구성됨"); //실행내용 
			} catch(NullPointerException ne) { // catch : 예외처리 Exception Handling
				// getMessage => JVM 이 예외에 대한 메세지 null 로 세팅되서 get으로 가져옴 
				System.out.println(ne.getMessage() + "예외처리 =>  이름 정보가 존재하지 않아 길이를 구할 수 없습니다.");
				ne.printStackTrace(); // Exception 메세지와 발생경로를 출력 
			} 
		System.out.println("프로그램 정상 수행");
		}
	}
