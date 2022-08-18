package step9;
// 키값이 중복되는 이셉션도 만들수있다 예 ) Tel , day 
public class DayException extends Exception {
	
	private static final long serialVersionUID = 3285154084609962710L;
	public DayException() {
		super();
	}
	public DayException(String message) {
		super(message);
	}
}
