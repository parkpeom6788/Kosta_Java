package step7_test;

/*
 * step6에서는 생성자를 명시하지 않아 개인 정보를 할당받지 않아도 객체가 생성되었음
 * 이름 업데이트 하여 반드시 개인정보를 전달받아야 신용카드 객체가 생성되도록
 * 생성자를 명시한다
 * 생성자 Constructor => 객체 초기화 작업을 담당 , 객체 생성시점에 필요한 초기화 작업을 말한다
 * 		ex ) 신용카드 객체가 생성되기 위해서는 개인 정보를 할당받아
 * 				신용 등급을 확인 후 문제가 없으면 객체가 생성(카드 발급) 되도록
 * 				하는 것이 초기화 작업이다
 */

public class CreditCardVer2 {
	private String customerInfo;
	// 신용카드 객체 생성 전에 필요한 초기 작업을 수행
	
	public CreditCardVer2(String customerInfo) {
		this.customerInfo = customerInfo;
	}
	
	public CreditCardVer2() {  // 기본생성자를 따로 생성해 줘야 한다.
	}
	
	public String getCustomerInfo() {
		return customerInfo;
	}
	
	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}
}
