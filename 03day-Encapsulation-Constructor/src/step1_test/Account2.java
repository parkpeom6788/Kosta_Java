package step1_test;

public class Account2 {
	public String password;
	private String capsulPassword;
	
	// 은닉화
	// getter 와 setter 로 접근하게 한다 ( 소통부 )
	// getter : 외부에서 정보를 얻기 위해 호출하는 메서드
	public String getCapsulPassword() {
		return capsulPassword;
	}
	
	// setter : 외부에서 정보를 할당하기 위해 호출하는 메서드
	public void setCapsulPassword(String capsulPassword) {
		// this : 매개변수(지역변수)와 인스턴스 변수를 구별하기 위해
		//				인스턴스를 가리키는 this 예약어를 사용
		// this 현재 객체 인스턴스 객체를 가르킨다
		// 인스턴스 변수 = 매개변수(지역변수)
		this.capsulPassword = capsulPassword;
	}
}
