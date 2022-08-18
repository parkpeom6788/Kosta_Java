package step8;
/*
 * 예외 클래스를 정의 : java.lang.Exception 을 상속받으면 된다. 
 */
public class AgeException extends Exception {
	public AgeException() {
		super("나이 정보를 다시 확인하세요.");
	}
	public AgeException(String message) { // getMessage Exception super(message) 반환 
		super(message);
	}
}
