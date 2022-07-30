package step6_test;

public class TestConstructor2 {
	
	public static void main(String[] args) {
		// 아래코드는 개인정보를 통한 신용확인 없이
		// 신용카드 객체를 생성할 수 있는 사례
		// step7 예제에서 개인정보가 전달되지 않으면 
		// 신용카드 객체가 생성될 수 없도록 현 예제를 업데이트 한다.
		CreditCard card = new CreditCard(); // <- 개인정보가 없어도 카드가생성되는 문제가 발생
		System.out.println(card + "카드 발급");
		card.setCustomerInfo("아이유 개인정보");
		System.out.println(card.getCustomerInfo() + " 카드 대금 요청");
		
	}
}
