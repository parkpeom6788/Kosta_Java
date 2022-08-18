package step1;
// 직접 Exception 을 정의하기 : java.lang.Exception을 상속받으면 된다.
public class NoMoneyException extends Exception {
	// IO 에서 공부할 예정
	private static final long serialVersionUID = 7448528606571933648L;
	public NoMoneyException() {
		super();
//		this.getMessage() Exception클래스는 getMessage가 있어서 catch부분에 쓸수있다.
	}
	public NoMoneyException(String message) {
		super(message); // super는 맨 첫줄 
		System.out.println("A");
	}
}	