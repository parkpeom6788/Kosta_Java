package step4;

public class TestIf4 {
	public static void main(String[] args) {
		Account a = new Account();
		if(a.getBalance() != 0) {
			System.out.println(a.getBalance()); // 0
		}
		a.deposit(100);
		a.deposit(200);
		System.out.println(a.getBalance()); // 300
		// 아래와 같이 입금액이 잘못되었을때
		// 즉 입금액이 0원을 초과하지 않을 경우
		// 잘못된 입금액 입니다가 출력 
		a.deposit(-1);
		System.out.println(a.getBalance()); // 300
	}
}
