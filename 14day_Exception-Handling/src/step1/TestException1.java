package step1;
/**
 * java application 실행시 jvm은 Exception (예외 ) 상황을 만나면 해당 Exception ( 아래의 경우는 NullPointerException) 을
 * 발생시킨 후 별도의 처리(핸들러)가 없다면 즉시 메세지 출력 후 비정상 종료된다. 
 * @author KOSTA
 * 
 */
public class TestException1 {
	public static void main(String[] args) {
		System.out.println("프로그램이 실행시작");
		String name = "아이유";
		name = null; // 고의로 null를 할당해 Exception 발생되도록 해본다 
		System.out.println(name.length() + "자로 이름이 구성됨"); //실행내용 비즈니스로직  
		// null인데 length 호출시 예외발생
		System.out.println("프로그램이 정상수행"); 
		}
	}
