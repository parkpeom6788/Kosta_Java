package step8;
/*
 * 예외 클래스를 정의 : java.lang.Exception 을 상속받으면 된다. 
 */
public class AgeException extends Exception {
	/**
	 * serialVersionUID 이후 다음주 객체직렬화에서 공부예정 : 신경쓰지 맙시다.
	 */
	private static final long serialVersionUID = 220838069605410987L; 
	public AgeException() {
		super("나이 정보를 다시 확인하세요."); // getMessage 로 가져올수있음  상속받은 부모 Exception 클래스의 생성자 호출 message 할당 
																	// 이후 catch 구문에서 getMessage() 로 확인 가능
		// message the detail message. The detail message is saved forlater retrieval by the getMessage() method.
	}
	// 나이에 따라 다른메시지를 출력하려면 생성자 오버로딩 한다
	public AgeException(String message) {
		super(message);// 생성자 오버로딩
	}
}
