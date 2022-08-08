package step1;

// static - 공유 정보
// non-static - 개별 정보

public class TestStatic5 {
	public static void main(String[] args) {
		// balance static 이므로 객체 생성없이 접근 가능 
		Account.balance = 100;
		// 아래는 static을 잘못 사용한 예 
		// Account class 로부터 객체를 생성해 계좌 잔액 balance는
		// 독립적 공간에서 별도로 관리되어야 한다
		// Account class의 balance는 instance는 non-static 인 instance variable 이 적합 
		// 만약 지금 예제처럼 static 으로 처리할 경우에는 
		// 모든 고객이 하나의 잔액 정보를 공유해 사용하게 된다 => 부적합 
		/*
		Account a = new Account("아이유");
		System.out.println(a.balance);
		Account a2 = new Account("손흥민");
		System.out.println(a2.balance);
		a2.balance = 90000;
		
		// 문제점 : 계좌잔액은 독립적으로 사용해야되는데 공유하게됨
		System.out.println(a2.name + " 잔액 : " + a2.balance); // 90000
		System.out.println(a.name + " 잔액 : " + a.balance); // 90000
		*/
	}
}
