package step4_test;

public class Account_test {
	private long balance; // 큰돈이면 long 형으로
	/*
	 * 입금하는 기능의 메서드 : balance 잔액을 누적
	 */
	public void deposit(long money) {
		if(money > 0) {
			balance += money; // 누적 
		} else { // 0 이하를 입금하게되면 발생 !!! 
			System.out.println("잘못된 입금액 입니다.");
		}
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
