package step7;
// 접근 제어자 테스트
public class Airplane {
	public String company="kal";
	protected String company2="kal";
	String company3="kal";
	// private 은 다른 클래스에 접근을 할 수 없다.
	private String company4="kal";
	// 아래처럼 클래스 내부에서만 사용할 수 있다
	public String getCompany4() {
		return company4;
	}
}
