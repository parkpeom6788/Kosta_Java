package step6;

public class CreditCard {
	private String customerInfo;
	// 별도의 생성자를 명시하지 않았으므로 컴파일시에 
	// 기본 생성자가 자동 삽입
	// public CreditCard(){}
	
	
	public String getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}
}
