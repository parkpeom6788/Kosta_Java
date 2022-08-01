package step4;

public class Account {
	private long balance; // 큰돈이면 long형으로 
	/*
	 * 입금하는 기능의 메서드 : balance 잔액을 누적 
	 */
	public void deposit(long money) {
		if(money > 0) {
			balance += money; // 복합대입 연산자
		} else { // money 가 0을 초과하지 않으면 
			System.out.println("잘못된 입금액 입니다");
		}
	}
	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
}
