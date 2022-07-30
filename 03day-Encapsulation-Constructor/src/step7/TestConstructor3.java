package step7;

public class TestConstructor3 {
	public static void main(String[] args) {
		// 리팩토리 : 내부 구조를 개선 작업
		// compiler error : 개인정보를 전달하지 않고 객체 생성할 수 없음
		// CreditCardVer2 card = new CreditCardVer2(); 
		// 아래와 같이 생성자에서 요구하는 개인정보를 전달할 때만
		// 신용카드 객체를 생성할 수 있다.
		CreditCardVer2 card = new CreditCardVer2("손흥민 개인정보"); 
		System.out.println(card +" 카드 발급"); 
		card.setCustomerInfo("손흥민 개인정보");
		System.out.println(card.getCustomerInfo() + "카드 대금 요청");
	}
}
