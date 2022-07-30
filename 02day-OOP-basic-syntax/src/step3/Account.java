package step3;
public class Account {
	String name; //인스턴스 변수 : 객체의 속성 정보를 저장하는 영역
	/*
	 *  메서드 : 객체의 기능을 정의 
	 *  public : 접근 제어자 , 어디서나 접근 가능
	 *  void : 리턴값이 없을 때 명시하는 자바 키워드 
	 *  (int money) : 매개변수 parameter 이자 지역변수 
	 *  					매개변수는 사용하는 측에서 전달한 데이터를 저장하기 위한 공간
	 */
	public void deposit(int money) {
		System.out.println("server" + name + "님이 계좌에 " + money + "원을 입금하다");
	}
	// 리턴값이 있을 때는 void 대신 리턴값의 타입을 명시한다.
	public int withdraw(int money) {
		// 은행 계좌에 잔액을 확인하는 과정 
		return money; // 호출한 쪽으로 money 정보를 리턴
	}
}





















