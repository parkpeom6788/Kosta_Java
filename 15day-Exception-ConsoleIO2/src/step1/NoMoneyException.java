package step1;
public class NoMoneyException extends Exception {
	private static final long serialVersionUID = 7448528606571933648L;
	public NoMoneyException() {
		super();
	}
	public NoMoneyException(String message) {
		super(message);
	}
}
