package model.exception;

public class DuplicateTelException extends Exception{
	// 다음주 공부 예정
	private static final long serialVersionUID = 7593654778364501359L;
	public DuplicateTelException(String message) {
		super(message);// Exception 의 생성자 호출 , getMessage() 로 반환 가능 
	}
}
